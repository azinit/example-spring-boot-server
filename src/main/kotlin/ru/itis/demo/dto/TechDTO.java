package ru.itis.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.demo.models.Tech;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Data
public class TechDTO {
    private Long id;
    private String lang;
    private String framework;

    public static TechDTO from(Tech tech) {
        return TechDTO.builder()
                .framework(tech.getFramework())
                .lang(tech.getLang())
                .id(tech.getId())
                .build();
    }

    public static List<TechDTO> from(List<Tech> techs) {
        return techs.stream()
                .map(TechDTO::from)
                .collect(Collectors.toList());
    }
}
