/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doris;

import java.util.Iterator;
import java.util.Map;

/**
 * @author mary
 */
public class DORIS {

    /**
     * @param args the command line arguments
     */
    public static String replaceWithNS(String url) {
        Iterator it = Constants.pathToNamespase.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            if (url.contains((CharSequence) pair.getKey())) {
                url = url.replace((String) pair.getKey(), (String) pair.getValue());
                break;
            }
        }

        return url;
    }


    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-projectFolder")) {
                Constants.projectFolder = args[++i];
            } else if (args[i].equals("-separatorSpace")) {
                Constants.separatorSpace = args[++i];
            }
        }
        Constants.updateConstants();
        Constants.initializePathNamespaseMaps();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Introduction().setVisible(true);
            }
        });
    }

}
