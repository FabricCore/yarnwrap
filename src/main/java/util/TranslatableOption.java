package yarnwrap.util;
public class TranslatableOption { public net.minecraft.util.TranslatableOption wrapperContained; public TranslatableOption(net.minecraft.util.TranslatableOption wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.text.Text getText() { return new yarnwrap.text.Text(wrapperContained.getText()); }
public java.lang.String getTranslationKey() { return wrapperContained.getTranslationKey(); }
public int getId() { return wrapperContained.getId(); }

}