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
    ALBANIE("Alb�nie"),
    ANDORRA("Andorra"),
    BELIGE("Belgie"),
    BELORUSKO("B�lorusko"),
    BOSNA("Bosna a Hercegovina"),
    BULHARSKO("Bulharsko"),
    CERNA_HORA("�ern� Hora"),
    CESKA_REPUBLIKA("�esk� republika"),
    DANSKO("D�nsko"),
    ESTONSKO("Estonsko"),
    FINSKO("Finsko"),
    FRANCIE("Francie"),
    CHORVATSKO("Chorvatsko"),
    IRSKO("Irsko"),
    ISLAND("Island"),
    ITALIE("It�lie"),
    KOSOVO("Kosovo"),
    KYPR("Kypr"),
    LISCHENSTEJNSKO("Lichten�tejnsko"),
    LITVA("Litva"),
    LOTYSKO("Loty�sko"),
    LUCEMBURSKO("Lucembursko"),
    MADARSKO("Ma�arsko"),
    MAKEDONIE("Makedonie"),
    MALTA("Malta"),
    MOLDAVSKO("Moldavsko"),
    NEMECKO("N�mecko"),
    NIZOZEMSKO("Nizozemsko"),
    NORSKO("Norsko"),
    POLSKO("Polsko"),
    PORTUGALSKO("Portugalsko"),
    RAKOUSKO("Rakousko"),
    RUMUNSKO("Rumunsko"),
    RUSKO("Rusko"),
    RESCKO("�ecko"),
    SANMARINO("San Marino"),
    SLOVENSKO("Slovensko"),
    SLOVINCKO("Slovinsko"),
    VELKA_BRITANIE("Velk� Brit�nie"),
    SRBSKO("Srbsko 	B�lehrad"),
    SPANELSKO("�pan�lsko"),
    SVEDSKO("�v�dsko"),
    SVYCARSKO("�v�carsko"),
    UKRAJINA("Ukrajina"),
    VATIK�N("Vatik�n");

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
