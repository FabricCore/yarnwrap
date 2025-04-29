package yarnwrap.util;
public class TranslatableOption { public net.minecraft.util.TranslatableOption wrapperContained; public TranslatableOption(net.minecraft.util.TranslatableOption wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.text.Text getText() { return new yarnwrap.text.Text(wrapperContained.getText()); }
// public static yarnwrap.text.Text getText() { return new yarnwrap.text.Text(net.minecraft.util.TranslatableOption.getText()); }
public java.lang.String getTranslationKey() { return wrapperContained.getTranslationKey(); }
// public static java.lang.String getTranslationKey() { return net.minecraft.util.TranslatableOption.getTranslationKey(); }
public int getId() { return wrapperContained.getId(); }
// public static int getId() { return net.minecraft.util.TranslatableOption.getId(); }

}