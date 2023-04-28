package electricity.com.xworkz.policeStation.repo;

import java.util.ArrayList;
import java.util.Collection;

import electricity.com.xworkz.policeStation.dto.PoliceStationDTO;

public class PoliceStationRepoImpl implements PoliceStationRepo {

	private Collection<PoliceStationDTO> policedto = new ArrayList<PoliceStationDTO>();

	public PoliceStationRepoImpl() {
		
	}
	@Override
	public boolean save(PoliceStationDTO dto) {

		return this.policedto.add(dto);

	}

}
