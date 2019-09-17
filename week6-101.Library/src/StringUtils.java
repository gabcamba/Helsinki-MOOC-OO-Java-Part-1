/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gab Camba
 */
public class StringUtils {

    public static boolean included(String word, String searched) {
        searched = searched.trim();

        return word.toUpperCase().contains(searched.toUpperCase());
    }
}
