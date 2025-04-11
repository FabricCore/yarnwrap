package yarnwrap.text;
public class TranslationException { public net.minecraft.text.TranslationException wrapperContained; public TranslationException(net.minecraft.text.TranslationException wrapperContained) { this.wrapperContained = wrapperContained; }

public TranslationException(yarnwrap.text.TranslatableTextContent text,int index) { this.wrapperContained = new net.minecraft.text.TranslationException(text.wrapperContained,index); }
public TranslationException(yarnwrap.text.TranslatableTextContent text,java.lang.String message) { this.wrapperContained = new net.minecraft.text.TranslationException(text.wrapperContained,message); }
public TranslationException(yarnwrap.text.TranslatableTextContent text,java.lang.Throwable cause) { this.wrapperContained = new net.minecraft.text.TranslationException(text.wrapperContained,cause); }

}