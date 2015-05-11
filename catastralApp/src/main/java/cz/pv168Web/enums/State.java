/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.pv168Web.enums;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Enumeration of states
 */
public enum State {

    EMPTY(""),
    ALBANIE("Albánie"),
    ANDORRA("Andorra"),
    BELIGE("Belgie"),
    BELORUSKO("Bìlorusko"),
    BOSNA("Bosna a Hercegovina"),
    BULHARSKO("Bulharsko"),
    CERNA_HORA("Èerná Hora"),
    CESKA_REPUBLIKA("Èeská republika"),
    DANSKO("Dánsko"),
    ESTONSKO("Estonsko"),
    FINSKO("Finsko"),
    FRANCIE("Francie"),
    CHORVATSKO("Chorvatsko"),
    IRSKO("Irsko"),
    ISLAND("Island"),
    ITALIE("Itálie"),
    KOSOVO("Kosovo"),
    KYPR("Kypr"),
    LISCHENSTEJNSKO("Lichtenštejnsko"),
    LITVA("Litva"),
    LOTYSKO("Lotyšsko"),
    LUCEMBURSKO("Lucembursko"),
    MADARSKO("Maïarsko"),
    MAKEDONIE("Makedonie"),
    MALTA("Malta"),
    MOLDAVSKO("Moldavsko"),
    NEMECKO("Nìmecko"),
    NIZOZEMSKO("Nizozemsko"),
    NORSKO("Norsko"),
    POLSKO("Polsko"),
    PORTUGALSKO("Portugalsko"),
    RAKOUSKO("Rakousko"),
    RUMUNSKO("Rumunsko"),
    RUSKO("Rusko"),
    RESCKO("Øecko"),
    SANMARINO("San Marino"),
    SLOVENSKO("Slovensko"),
    SLOVINCKO("Slovinsko"),
    VELKA_BRITANIE("Velká Británie"),
    SRBSKO("Srbsko 	Bìlehrad"),
    SPANELSKO("Španìlsko"),
    SVEDSKO("Švédsko"),
    SVYCARSKO("Švýcarsko"),
    UKRAJINA("Ukrajina"),
    VATIKÁN("Vatikán");

    private String state;

    private State(String s) {
        state = s;
    }

    /**
     *
     * @return code of state
     */
    public String getCode() {

        return state;
    }

    /**
     *
     * @return array of states
     */
    public static String[] getStateArray() {
        String[] results = new String[State.values().length];
        int count = 0;
        for (State state : State.values()) {
            results[count] = state.getCode();
            count++;
        }
        return results;
    }

    /**
     *
     * @param state
     * @return index of specific state
     */
    public static int getIndexOfState(String state) {
        int count = 0;
        for (State s : State.values()) {
            if (s.getCode().equalsIgnoreCase(state)) {
                return count;
            }
            count++;
        }
        return 0;

    }

}
