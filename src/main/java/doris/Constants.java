/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doris;

import java.util.HashMap;

/**
 * @author mary
 */
public class Constants {


    public static String projectFolder = "";
    public static String config = projectFolder + "config/";
    public static String queries = config + "queries/";
    public static String inputs = config + "inputs/";


    public static String separatorSpace = "\\s+";


    public static HashMap<String, String> pathToNamespase = new HashMap<String, String>();
    public static HashMap<String, String> namespaseToPath = new HashMap<String, String>();

    public static void updateConstants() {
        config = projectFolder + "config/";
        queries = config + "queries/";
        inputs = config + "inputs/";
    }

    public static void initializePathNamespaseMaps() {
        pathToNamespase.put("http://yago-knowledge.org/resource/", "yago:");
        namespaseToPath.put("yago:", "http://yago-knowledge.org/resource/");

        pathToNamespase
                .put("<http://www.w3.org/1999/02/22-rdf-syntax-ns#type>",
                        "rdf:type");
        namespaseToPath.put("rdf:type",
                "<http://www.w3.org/1999/02/22-rdf-syntax-ns#type>");

        pathToNamespase.put("<http://www.w3.org/2000/01/rdf-schema#label>",
                "rdfs:label");
        namespaseToPath.put("rdfs:label",
                "<http://www.w3.org/2000/01/rdf-schema#label>");

        pathToNamespase.put(
                "<http://www.w3.org/2000/01/rdf-schema#subClassOf>",
                "rdfs:subClassOf");
        namespaseToPath.put("rdfs:subClassOf",
                "<http://www.w3.org/2000/01/rdf-schema#subClassOf>");

        pathToNamespase.put("<http://www.w3.org/2002/07/owl#sameAs>",
                "owl:sameAs");
        namespaseToPath.put("owl:sameAs",
                "<http://www.w3.org/2002/07/owl#sameAs>");

        pathToNamespase.put("<http://www.w3.org/2000/01/rdf-schema#seeAlso>",
                "rdfs:seeAlso");
        namespaseToPath.put("rdfs:seeAlso",
                "<http://www.w3.org/2000/01/rdf-schema#seeAlso>");

        pathToNamespase.put("<http://www.w3.org/2000/01/rdf-schema#comment>",
                "rdfs:comment");
        namespaseToPath.put("rdfs:comment",
                "<http://www.w3.org/2000/01/rdf-schema#comment>");


        pathToNamespase.put("http://dbpedia.org/resource/", "DBP:");
        namespaseToPath.put("DBP:", "http://dbpedia.org/resource/");

        pathToNamespase.put("http://data.bnf.fr/ark:/12148/", "BNF:");
        namespaseToPath.put("BNF:", "http://data.bnf.fr/ark:/12148/");


    }
}
