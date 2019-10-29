package worksheet_3;

import java.util.Scanner;

public class GenerateClass {
    public String classname;
    public String[] variableNames;
    public String[] variableTypes;

    public GenerateClass(String classname, String[] variableNames, String[] variableTypes) {
        this.classname = classname;
        this.variableNames = variableNames;
        this.variableTypes = variableTypes;
    }
    public String makeFields() {
        int index = 0;
        String str = "";
        while (index < variableNames.length  ) {
            str +=  " private " + variableTypes[index] +" " + variableNames[index] + ";" + "\n";
            index++;
        }
        return str;
    }
    public String makeConstructor() {
        int index = 0;
        String tempstr = "";
        while (index < variableNames.length) {
            tempstr += "" + variableTypes[index] + " " + variableNames[index] + ", ";
            index++;
        }
        String str = "public " + this.classname +
                "(" +  tempstr.substring(0,tempstr.length() - 2) + ")"
                + " {" + "\n";
        index = 0;
        while (index < variableNames.length) {
            str += " this." + variableNames[index] + " = " +
                    variableNames[index] + ";\n";
            index++;
        }
        return str + "}";
    }


    public String makeGetters() {
        int index = 0;
        String str = "";
        while (index < variableNames.length) {
            str += "public " + variableTypes[index] + " " +
                    "get"+Character.toUpperCase(variableNames[index].charAt(0)) +
                    variableNames[index].substring(1, variableNames[index].length()) +
                    "(){" + "\n"+
                    "  return "+ variableNames[index] +";" +"\n" +
                    "}"
            ;
            index++;
            if (index != variableNames.length) {
                str += "\n";
            }
        }

        return str;
    }
    public String makeSetters() {
        int index = 0;
        String str = "";
        while (index < variableNames.length) {
            str += "public" + " void" + " " +
                    "set"+Character.toUpperCase(variableNames[index].charAt(0)) +
                    variableNames[index].substring(1,variableNames[index].length()) +
                    "(){" + "\n" +
                    "  this."+ variableNames[index] +" = "+
                    variableNames[index] +";\n" +
                    "}";
            index++;
            if (index != variableNames.length) {
                str += "\n";
            }
        }

        return str;
    }

    public void writeFile() {
        Scanner s = new Scanner("sdfasd");
        while (s.hasNext()) {
            System.out.println(s.next());
        }

    }

}
