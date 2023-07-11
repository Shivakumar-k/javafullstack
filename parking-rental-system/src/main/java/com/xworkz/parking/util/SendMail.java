package com.xworkz.parking.util;

import java.text.DecimalFormat;
import java.util.Properties;
import java.util.Random;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {
	public static String otp = new DecimalFormat("0000").format(new Random().nextInt(9999));

	public SendMail() {
		System.out.println("No args SendMail const");
	}

	public static boolean sendMail(String email, UserSignUpEntity entity) {
		String toEmail = email;// change accordingly
		String fromEmail = "Shivak6318@outlook.com";// change accordingly
		String password = "shiva@44";
		String host = "smtp.office365.com";// or IP address

		// Get the session object
		Properties properties = System.getProperties();
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.debug", "true");
		properties.put("mail.transport.protocol", "smtp");

		Session session = Session.getInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);

			}
		});

		// compose the message
		MimeMessage message = new MimeMessage(session);
		try {

			System.out.println(otp);

			entity.setOtp(otp);

			message.setFrom(new InternetAddress(fromEmail));

			message.setSubject("OTP");
			message.setText("OTP id " + entity.getOtp());

			message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));

			// Send message
			Transport.send(message);
			System.out.println("message sent successfully....");

		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
		return true;
	}

}
