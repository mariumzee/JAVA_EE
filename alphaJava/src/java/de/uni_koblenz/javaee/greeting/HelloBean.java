/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de.uni_koblenz.javaee.greeting;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

      @Named
        @RequestScoped
        public class HelloBean {

            public String getMessage() {
                return "Hello, Course!";
            }
        }
    