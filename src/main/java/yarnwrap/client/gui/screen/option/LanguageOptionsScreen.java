package yarnwrap.client.gui.screen.option;
public class LanguageOptionsScreen { public net.minecraft.client.gui.screen.option.LanguageOptionsScreen wrapperContained; public LanguageOptionsScreen(net.minecraft.client.gui.screen.option.LanguageOptionsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object languageSelectionList() { return wrapperContained.languageSelectionList; }
// // public void languageSelectionList(Object value) { wrapperContained.languageSelectionList = value; }
// // public static Object languageSelectionList() { return net.minecraft.client.gui.screen.option.LanguageOptionsScreen.languageSelectionList; }
// // public static void languageSelectionList(Object value, ) { net.minecraft.client.gui.screen.option.LanguageOptionsScreen.languageSelectionList = value; }

// public yarnwrap.client.resource.language.LanguageManager languageManager() { return new yarnwrap.client.resource.language.LanguageManager(wrapperContained.languageManager); }
// public void languageManager(yarnwrap.client.resource.language.LanguageManager value) { wrapperContained.languageManager = value.wrapperContained; }
// public static yarnwrap.client.resource.language.LanguageManager languageManager() { return new yarnwrap.client.resource.language.LanguageManager(net.minecraft.client.gui.screen.option.LanguageOptionsScreen.languageManager); }
// public static void languageManager(yarnwrap.client.resource.language.LanguageManager value, ) { net.minecraft.client.gui.screen.option.LanguageOptionsScreen.languageManager = value.wrapperContained; }

// public yarnwrap.text.Text LANGUAGE_WARNING_TEXT() { return new yarnwrap.text.Text(wrapperContained.LANGUAGE_WARNING_TEXT); }
// public void LANGUAGE_WARNING_TEXT(yarnwrap.text.Text value) { wrapperContained.LANGUAGE_WARNING_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text LANGUAGE_WARNING_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.option.LanguageOptionsScreen.LANGUAGE_WARNING_TEXT); }
// public static void LANGUAGE_WARNING_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.option.LanguageOptionsScreen.LANGUAGE_WARNING_TEXT = value.wrapperContained; }

public LanguageOptionsScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.client.option.GameOptions options,yarnwrap.client.resource.language.LanguageManager languageManager) { this.wrapperContained = new net.minecraft.client.gui.screen.option.LanguageOptionsScreen(parent.wrapperContained,options.wrapperContained,languageManager.wrapperContained); }
// public void onDone() { wrapperContained.onDone(); }
// public static void onDone() { net.minecraft.client.gui.screen.option.LanguageOptionsScreen.onDone(); }
// public void method_57729(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_57729(button.wrapperContained); }
// public static void method_57729(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.option.LanguageOptionsScreen.method_57729(button.wrapperContained); }
// public void method_57730(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_57730(button.wrapperContained); }
// public static void method_57730(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.option.LanguageOptionsScreen.method_57730(button.wrapperContained); }

}