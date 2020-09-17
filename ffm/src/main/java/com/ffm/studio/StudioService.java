package com.ffm.studio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service public class StudioService {

    @Autowired
    StudioRepository studioRepository;

    public List<Studio> getStudios() {

        return studioRepository.getStudios();
    }

    public Studio getStudioById(Integer id) {

        return studioRepository.getStudioById(id);
    }

}
