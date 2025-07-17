package org.limit.debiting.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class LimitSchedule {

    @Scheduled(fixedDelay = 1000)
    public void scheduleClearLimits() {
        //обновляем лимиты + сбрасываем драфты;
    }
}
