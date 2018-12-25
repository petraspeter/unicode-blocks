	
public class Rename {

    public String rename(String name) {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < name.length(); i++) {
        Character character = name.charAt(i);
        if(i == 0)
          sb.append(Character.toLowerCase(character));	
        else if(character == '_' || character == '-')
          continue;
        else if (Character.isUpperCase(character))
          sb.append("_").append(Character.toLowerCase(character));
        else if (character == ' ')
          sb.append("_");
        else
          sb.append(character);
      }
      String result = sb.toString().replaceAll("__", "_");
      return result;
    }
  
  }
