package yarnwrap.client.option;
public class KeyBinding { public net.minecraft.client.option.KeyBinding wrapperContained; public KeyBinding(net.minecraft.client.option.KeyBinding wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set KEY_CATEGORIES() { return wrapperContained.KEY_CATEGORIES; }
// public void KEY_CATEGORIES(java.util.Set value) { wrapperContained.KEY_CATEGORIES = value; }
// public boolean pressed() { return wrapperContained.pressed; }
// public void pressed(boolean value) { wrapperContained.pressed = value; }
// public Object defaultKey() { return wrapperContained.defaultKey; }
// // public void defaultKey(Object value) { wrapperContained.defaultKey = value; }
// public Object boundKey() { return wrapperContained.boundKey; }
// // public void boundKey(Object value) { wrapperContained.boundKey = value; }
// public java.util.Map CATEGORY_ORDER_MAP() { return wrapperContained.CATEGORY_ORDER_MAP; }
// public void CATEGORY_ORDER_MAP(java.util.Map value) { wrapperContained.CATEGORY_ORDER_MAP = value; }
// public java.util.Map KEYS_BY_ID() { return wrapperContained.KEYS_BY_ID; }
// public void KEYS_BY_ID(java.util.Map value) { wrapperContained.KEYS_BY_ID = value; }
// public java.util.Map KEY_TO_BINDINGS() { return wrapperContained.KEY_TO_BINDINGS; }
// public void KEY_TO_BINDINGS(java.util.Map value) { wrapperContained.KEY_TO_BINDINGS = value; }
// public java.lang.String category() { return wrapperContained.category; }
// public void category(java.lang.String value) { wrapperContained.category = value; }
// public java.lang.String translationKey() { return wrapperContained.translationKey; }
// public void translationKey(java.lang.String value) { wrapperContained.translationKey = value; }
// public int timesPressed() { return wrapperContained.timesPressed; }
// public void timesPressed(int value) { wrapperContained.timesPressed = value; }
public java.lang.String MOVEMENT_CATEGORY() { return wrapperContained.MOVEMENT_CATEGORY; }
// public void MOVEMENT_CATEGORY(java.lang.String value) { wrapperContained.MOVEMENT_CATEGORY = value; }
public java.lang.String MISC_CATEGORY() { return wrapperContained.MISC_CATEGORY; }
// public void MISC_CATEGORY(java.lang.String value) { wrapperContained.MISC_CATEGORY = value; }
public java.lang.String MULTIPLAYER_CATEGORY() { return wrapperContained.MULTIPLAYER_CATEGORY; }
// public void MULTIPLAYER_CATEGORY(java.lang.String value) { wrapperContained.MULTIPLAYER_CATEGORY = value; }
public java.lang.String GAMEPLAY_CATEGORY() { return wrapperContained.GAMEPLAY_CATEGORY; }
// public void GAMEPLAY_CATEGORY(java.lang.String value) { wrapperContained.GAMEPLAY_CATEGORY = value; }
public java.lang.String INVENTORY_CATEGORY() { return wrapperContained.INVENTORY_CATEGORY; }
// public void INVENTORY_CATEGORY(java.lang.String value) { wrapperContained.INVENTORY_CATEGORY = value; }
public java.lang.String UI_CATEGORY() { return wrapperContained.UI_CATEGORY; }
// public void UI_CATEGORY(java.lang.String value) { wrapperContained.UI_CATEGORY = value; }
public java.lang.String CREATIVE_CATEGORY() { return wrapperContained.CREATIVE_CATEGORY; }
// public void CREATIVE_CATEGORY(java.lang.String value) { wrapperContained.CREATIVE_CATEGORY = value; }
public KeyBinding(java.lang.String translationKey,int code,java.lang.String category) { this.wrapperContained = new net.minecraft.client.option.KeyBinding(translationKey,code,category); }
// public KeyBinding(java.lang.String translationKey,Object type,int code,java.lang.String category) { this.wrapperContained = new net.minecraft.client.option.KeyBinding(translationKey,type,code,category); }
// public int compareTo(java.lang.Object other) { return wrapperContained.compareTo(other); }
public boolean isUnbound() { return wrapperContained.isUnbound(); }
// public void setKeyPressed(Object key,boolean pressed) { wrapperContained.setKeyPressed(key,pressed); }
public boolean matchesKey(int keyCode,int scanCode) { return wrapperContained.matchesKey(keyCode,scanCode); }
// public void method_1418(java.util.HashMap map) { wrapperContained.method_1418(map); }
public java.util.function.Supplier getLocalizedName(java.lang.String id) { return wrapperContained.getLocalizedName(id); }
// public void onKeyPressed(Object key) { wrapperContained.onKeyPressed(key); }
// public void setBoundKey(Object boundKey) { wrapperContained.setBoundKey(boundKey); }
public java.lang.String getCategory() { return wrapperContained.getCategory(); }
public void updatePressedStates() { wrapperContained.updatePressedStates(); }
// public void reset() { wrapperContained.reset(); }
public void updateKeysByCode() { wrapperContained.updateKeysByCode(); }
public boolean isDefault() { return wrapperContained.isDefault(); }
public java.lang.String getBoundKeyTranslationKey() { return wrapperContained.getBoundKeyTranslationKey(); }
public Object getDefaultKey() { return wrapperContained.getDefaultKey(); }
public java.lang.String getTranslationKey() { return wrapperContained.getTranslationKey(); }
public boolean matchesMouse(int code) { return wrapperContained.matchesMouse(code); }
public boolean isPressed() { return wrapperContained.isPressed(); }
public boolean equals(yarnwrap.client.option.KeyBinding other) { return wrapperContained.equals(other.wrapperContained); }
public boolean wasPressed() { return wrapperContained.wasPressed(); }
public void unpressAll() { wrapperContained.unpressAll(); }
public yarnwrap.text.Text getBoundKeyLocalizedText() { return new yarnwrap.text.Text(wrapperContained.getBoundKeyLocalizedText()); }
public void setPressed(boolean pressed) { wrapperContained.setPressed(pressed); }
public void untoggleStickyKeys() { wrapperContained.untoggleStickyKeys(); }

}