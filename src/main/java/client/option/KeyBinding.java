package yarnwrap.client.option;
public class KeyBinding { public net.minecraft.client.option.KeyBinding wrapperContained; public KeyBinding(net.minecraft.client.option.KeyBinding wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set KEY_CATEGORIES() { return wrapperContained.KEY_CATEGORIES; }
// public boolean pressed() { return wrapperContained.pressed; }
// public Object defaultKey() { return wrapperContained.defaultKey; }
// public Object boundKey() { return wrapperContained.boundKey; }
// public java.util.Map CATEGORY_ORDER_MAP() { return wrapperContained.CATEGORY_ORDER_MAP; }
// public java.util.Map KEYS_BY_ID() { return wrapperContained.KEYS_BY_ID; }
// public java.util.Map KEY_TO_BINDINGS() { return wrapperContained.KEY_TO_BINDINGS; }
// public java.lang.String category() { return wrapperContained.category; }
// public java.lang.String translationKey() { return wrapperContained.translationKey; }
// public int timesPressed() { return wrapperContained.timesPressed; }
public java.lang.String MOVEMENT_CATEGORY() { return wrapperContained.MOVEMENT_CATEGORY; }
public java.lang.String MISC_CATEGORY() { return wrapperContained.MISC_CATEGORY; }
public java.lang.String MULTIPLAYER_CATEGORY() { return wrapperContained.MULTIPLAYER_CATEGORY; }
public java.lang.String GAMEPLAY_CATEGORY() { return wrapperContained.GAMEPLAY_CATEGORY; }
public java.lang.String INVENTORY_CATEGORY() { return wrapperContained.INVENTORY_CATEGORY; }
public java.lang.String UI_CATEGORY() { return wrapperContained.UI_CATEGORY; }
public java.lang.String CREATIVE_CATEGORY() { return wrapperContained.CREATIVE_CATEGORY; }
public boolean isUnbound() { return wrapperContained.isUnbound(); }
// public void setKeyPressed(Object key,boolean pressed) { wrapperContained.setKeyPressed(key,pressed); }
public boolean matchesKey(int keyCode,int scanCode) { return wrapperContained.matchesKey(keyCode,scanCode); }
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