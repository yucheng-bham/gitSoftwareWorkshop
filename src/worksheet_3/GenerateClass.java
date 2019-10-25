package worksheet_3;

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
            str += " " + "private " + variableTypes[index] + variableNames[index] + ";" + "/n";
            index++;
        }
        return str;
    }
    public String makeConstructor() {
        int index = 0;
        String tempstr = "";
        while (index < variableNames.length) {
            tempstr += "" + variableTypes[index] + " " + variableNames[index] + ",";
            index++;
        }
        String str = "public " + this.classname +
                "(" +  tempstr.substring(0,tempstr.length() - 1) + ")"
                + " {" + "/n";
        index = 0;
        while (index < variableNames.length) {
            str += "  this." + variableNames[index] + " = " + variableNames[index] + "/n";
            index++;
        }
        return str + "}";
    }


    public String makeGetters() {
        int index = 0;
        String str = "";
        while (index < variableNames.length) {
            str += "public " + variableTypes[index] + " "
                    + "get"+Character.toUpperCase(variableNames[index].charAt(0))
                    + "(){" + "/n"
                    + "  return "+ variableNames +";" +"/n"
                    + "}"
            ;
            index++;
        }

        return str;
    }
    public String makeSetters() {
        int index = 0;
        String str = "";
        while (index < variableNames.length) {
            str += "public" + " void" + " "
                    + "set"+Character.toUpperCase(variableNames[index].charAt(0))
                    + "(){" + "/n"
                    + "  this."+ variableNames +" = "+ variableNames +";" +"/n"
                    + "}"
            ;
            index++;
        }

        return str;
    }

    public void writeFile() {

    }

}
