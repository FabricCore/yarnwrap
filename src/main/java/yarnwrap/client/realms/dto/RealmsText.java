package yarnwrap.client.realms.dto;
public class RealmsText { public net.minecraft.client.realms.dto.RealmsText wrapperContained; public RealmsText(net.minecraft.client.realms.dto.RealmsText wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String TRANSLATION_KEY_KEY() { return wrapperContained.TRANSLATION_KEY_KEY; }
// public void TRANSLATION_KEY_KEY(java.lang.String value) { wrapperContained.TRANSLATION_KEY_KEY = value; }
// public static java.lang.String TRANSLATION_KEY_KEY() { return net.minecraft.client.realms.dto.RealmsText.TRANSLATION_KEY_KEY; }
// public static void TRANSLATION_KEY_KEY(java.lang.String value, ) { net.minecraft.client.realms.dto.RealmsText.TRANSLATION_KEY_KEY = value; }

// public java.lang.String ARGS_KEY() { return wrapperContained.ARGS_KEY; }
// public void ARGS_KEY(java.lang.String value) { wrapperContained.ARGS_KEY = value; }
// public static java.lang.String ARGS_KEY() { return net.minecraft.client.realms.dto.RealmsText.ARGS_KEY; }
// public static void ARGS_KEY(java.lang.String value, ) { net.minecraft.client.realms.dto.RealmsText.ARGS_KEY = value; }

// public java.lang.String translationKey() { return wrapperContained.translationKey; }
// public void translationKey(java.lang.String value) { wrapperContained.translationKey = value; }
// public static java.lang.String translationKey() { return net.minecraft.client.realms.dto.RealmsText.translationKey; }
// public static void translationKey(java.lang.String value, ) { net.minecraft.client.realms.dto.RealmsText.translationKey = value; }

// public java.lang.String[] args() { return wrapperContained.args; }
// public void args(java.lang.String[] value) { wrapperContained.args = value; }
// public static java.lang.String[] args() { return net.minecraft.client.realms.dto.RealmsText.args; }
// public static void args(java.lang.String[] value, ) { net.minecraft.client.realms.dto.RealmsText.args = value; }

// public RealmsText(java.lang.String translationKey,java.lang.String[] args) { this.wrapperContained = new net.minecraft.client.realms.dto.RealmsText(translationKey,args); }
// public yarnwrap.client.realms.dto.RealmsText fromJson(com.google.gson.JsonObject json) { return new yarnwrap.client.realms.dto.RealmsText(wrapperContained.fromJson(json)); }
// public static yarnwrap.client.realms.dto.RealmsText fromJson(com.google.gson.JsonObject json, ) { return new yarnwrap.client.realms.dto.RealmsText(net.minecraft.client.realms.dto.RealmsText.fromJson(json)); }
public yarnwrap.text.Text toText(yarnwrap.text.Text fallback) { return new yarnwrap.text.Text(wrapperContained.toText(fallback.wrapperContained)); }
// public static yarnwrap.text.Text toText(yarnwrap.text.Text fallback, ) { return new yarnwrap.text.Text(net.minecraft.client.realms.dto.RealmsText.toText(fallback.wrapperContained)); }
public yarnwrap.text.Text toText() { return new yarnwrap.text.Text(wrapperContained.toText()); }
// public static yarnwrap.text.Text toText() { return new yarnwrap.text.Text(net.minecraft.client.realms.dto.RealmsText.toText()); }

}