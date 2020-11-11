package com.gameofthrones.ironbankstarter;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import javax.swing.*;

public class OnProductionCondition implements Condition {
    private static Boolean enabled;
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        if(enabled==null){
            String answer = JOptionPane.showInputDialog("Это продакшен, а?");
            enabled = answer.toLowerCase().contains("yes");
        }
        return enabled;
    }
}
