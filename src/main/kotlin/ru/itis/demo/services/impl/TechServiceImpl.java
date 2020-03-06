package ru.itis.demo.services.impl;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.itis.demo.dto.TechDTO;
import ru.itis.demo.models.Tech;
import ru.itis.demo.repository.TechRepository;
import ru.itis.demo.services.interfaces.TechService;

import java.util.ArrayList;
import java.util.List;

@Component
public class TechServiceImpl implements TechService {
    @Autowired
    private TechRepository techRepository;

    @NotNull
    @Override
    public List<TechDTO> getList() {
        Iterable<Tech> techs = techRepository.findAll();
        List<Tech> techList = new ArrayList<>();
        techs.forEach(techList::add);
        return TechDTO.from(techList);
    }

    @Override
    public void addTech(@NotNull Tech tech) {
        techRepository.save(tech);
    }
}
