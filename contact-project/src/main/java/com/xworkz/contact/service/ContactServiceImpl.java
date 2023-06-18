package com.xworkz.contact.service;

import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


import com.xworkz.contact.dto.ContactDTO;
import com.xworkz.contact.entity.ContactEntity;
import com.xworkz.contact.repository.ContactRepository;
@Service
@Component
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactRepository repository;
	
	public ContactServiceImpl() {
		System.out.println("no arg const of ContactServiceImpl");
	}

	@Override
	public boolean validateAndSave(ContactDTO dto) {
		System.out.println("Running validate And save");
		ContactEntity entity = new ContactEntity();
		BeanUtils.copyProperties(dto, entity);
		System.out.println(""+entity);
		boolean save = this.repository.save(entity);
		
		if(save) {
			boolean sendMail = sendMail(entity.getEmail());
			System.out.println(sendMail);
		}else {
			System.out.println("mail not found");
		}
		return true;
	}
	
	@Override
	public List<ContactDTO> findByName(String name) {
		System.out.println("Running findByName in serviceimpl ");
		List<ContactEntity> entities = this.repository.findByName(name);
		
		List<ContactDTO> dtos = entities.stream().map(ent -> {
			ContactDTO contactDTO = new ContactDTO();
			BeanUtils.copyProperties(ent, contactDTO);
			return contactDTO;
		}).collect(Collectors.toList());

		return dtos;
		
	}
	
	
	
	private boolean sendMail(String email) {
		System.out.println("running Send mail method in service");
		String to = email;
		String from = "Shivak6318@outlook.com";
		String password = "shiva@44";
		String host = "smtp.office365.com";//ip address of outlook
		
		Properties properties = System.getProperties();
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.debug", "true");
		properties.put("mail.transport.protocol", "smtp");
		
		Session session=Session.getDefaultInstance(properties, null);
		
		//compose mail
		
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("Hey!");
			message.setText("Thank you for registering,Enjoy");
			
			
			Transport.send(message, from, password);
			System.out.println("Message Sent Successfully");
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
		
		return true;

	}
}
