package com.company.stateAndFlyWeight;

import java.util.HashMap;

public class FlyWeightFactory {


    private HashMap<Integer, State> states = new HashMap();

    public State getState(int stateCode){
       State state = states.get(stateCode);
        if (state == null){
            switch (stateCode){
                case 1 : {
                    state = new SolidState();
                    break;
                }
                case 2 : {
                    state = new LiquidState();
                    break;
                }
                case 3 : {
                    state = new GaseousState();
                    break;
                }
            }
            states.put(stateCode, state);
        }
        return state;
    }
}
