package com.ist.slik.ingest.utils.mapper;
import com.ist.slik.ingest.dto.ApplicantDto;
import com.ist.slik.ingest.entity.Applicant;
import com.ist.slik.ingest.utils.CommonMapperUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ApplicantMapper {

    ApplicantMapper INSTANCE = Mappers.getMapper(ApplicantMapper.class);

    @Mappings({
            @Mapping(target = "customerType", source = "customerType", qualifiedByName = "stringToChar"),
            @Mapping(target = "gender", source = "gender", qualifiedByName = "stringToChar")
    })
    ApplicantDto entityToDto(Applicant entity);

    @Mappings({
            @Mapping(target = "customerType", source = "customerType", qualifiedByName = "charToString"),
            @Mapping(target = "gender", source = "gender", qualifiedByName = "charToString")
    })
    Applicant dtoToEntity(ApplicantDto dto);
    @Named("stringToChar")
    default char stringToChar(String string) {
        return CommonMapperUtils.stringToChar(string);
    }

    @Named("charToString")
    default String charToString(char character) {
        return CommonMapperUtils.charToString(character);
    }
}