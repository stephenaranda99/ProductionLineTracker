package stephenaranda24;

public enum ItemType {
  AUDIO("AU"),
  VISUAL("VI"),
  AUDIO_MOBILE("AM"),
  VISUAL_MOBILE("VM");

  private String code;

  ItemType(String code) {
    this.code = code;
  }
  public String getCode(){
    return code;
  }
}