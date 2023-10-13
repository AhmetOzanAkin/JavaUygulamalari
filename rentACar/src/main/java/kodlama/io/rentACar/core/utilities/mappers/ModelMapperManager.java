package kodlama.io.rentACar.core.utilities.mappers;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ModelMapperManager implements ModelMapperService{

	private ModelMapper modelMapper;
	@Override
	public ModelMapper forResponse() {
	
		this.modelMapper.getConfiguration()
		.setAmbiguityIgnored(true) // belirsizlik durumunu ignore et
		.setMatchingStrategy(MatchingStrategies.LOOSE); // sadece istenilen field'leri getirir LOOSE
		return this.modelMapper;
	}

	@Override
	public ModelMapper forRequest() {
		this.modelMapper.getConfiguration()
		.setAmbiguityIgnored(true) // belirsizlik durumunu ignore et
		.setMatchingStrategy(MatchingStrategies.STANDARD); // bütün fieldleri getirir

		return this.modelMapper;
	}

}
