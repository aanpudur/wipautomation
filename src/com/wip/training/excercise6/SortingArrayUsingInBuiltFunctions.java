package com.wip.training.excercise6;

import java.util.Arrays;

public class SortingArrayUsingInBuiltFunctions {

    public static void main(String[] args) {
        
        String[] countries_Array = {
                "Bangladesh",
                "Barbados",
                "Belarus",
                "Belgium",
                "Belize",
                "Benin",
                "Argentina",
                "Armenia",
                "Aruba",
                "Australia",
                "Zambia",
                "Zimbabwe",
                "Yemen",
                "Vanuatu",
                "Venezuela",
                "Vietnam",
                "Uganda",
                "Ukraine",
                "United Arab Emirates",
                "United Kingdom",
                "Uruguay",
                "Uzbekista",
                "Tajikistan",
                "Tanzania",
                "Thailand",
                "Timor-Leste",
                "Togo",
                "Tonga",
                "Trinidad and Tobago",
                "Tunisia",
                "Turkey",
                "Latvia",
                "Lebanon",
                "Lesotho",
                "Liberia",
                "Libya",
                "Liechtenstein",
                "Lithuania",
                "Malawi",
                "Malaysia",
                "Maldives",
                "Mali",
                "Malta",
                "Marshall Islands",
                "Mauritania",
                "Mauritius",
                "Mexico",
                "Micronesia",
                "Moldova",
                "Turkmenistan",
                "Tuvalu",
                "Samoa",
                "San Marino",
                "Sao Tome and Principe",
                "Saudi Arabia",
                "Senegal",
                "Serbia",
                "Seychelles",
                "Sierra Leone",
                "Singapore",
                "Sint Maarten",
                "Slovakia",
                "Slovenia",
                "Solomon Islands",
                "Somalia",
                "South Africa",
                "South Korea",
                "South S",
                "Palestinian Territories",
                "Panama",
                "Papua New Guinea",
                "Paraguay",
                "Peru",
                "Philippines",
                "Poland"                          
        };
    
        System.out.println("Before sorting:");
        
        for(int i = 0; i < countries_Array.length; i++){
            System.out.print(countries_Array[i] + ", ");         
        }
        
        Arrays.sort(countries_Array);
        System.out.println("\n\nAfter sorting:");
        for(int i = 0; i < countries_Array.length; i++){
            System.out.print(countries_Array[i] + ", ");              
        }
    }
}
