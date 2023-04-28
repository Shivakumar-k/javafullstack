package electricity.com.xworkz.policeStation.boot;

import electricity.com.xworkz.policeStation.dto.PoliceStationDTO;
import electricity.com.xworkz.policeStation.repo.PoliceStationRepo;
import electricity.com.xworkz.policeStation.repo.PoliceStationRepoImpl;
import electricity.com.xworkz.policeStation.service.PoliceStationService;
import electricity.com.xworkz.policeStation.service.PoliceStationServiceImpl;

public class PoliceStationDTORunner {

	public static void main(String[] args) {
		
		PoliceStationRepo repo=new PoliceStationRepoImpl();
		
		PoliceStationService service = new PoliceStationServiceImpl(repo);
		
		PoliceStationDTO dto1 = new PoliceStationDTO(1, "CentralPolice", "BhanvarSingh Shekhawat", "rajajinagar", 4); 
		PoliceStationDTO dto2 = new PoliceStationDTO(2, "GabbarSingh PoliceStation", "GabbarSingh", "vijaynagar", 3); 
		
		
		boolean save = service.validateAndSave(dto1);
		System.out.println(save);
		
		boolean save1 = service.validateAndSave(dto2);
		System.out.println(save1);
		
		
	

	}

}
