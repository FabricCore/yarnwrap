package yarnwrap.block.entity;
public class SignText { public net.minecraft.block.entity.SignText wrapperContained; public SignText(net.minecraft.block.entity.SignText wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.block.entity.SignText.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.block.entity.SignText.CODEC = value; }

// public com.mojang.serialization.Codec MESSAGES_CODEC() { return wrapperContained.MESSAGES_CODEC; }
// public void MESSAGES_CODEC(com.mojang.serialization.Codec value) { wrapperContained.MESSAGES_CODEC = value; }
// public static com.mojang.serialization.Codec MESSAGES_CODEC() { return net.minecraft.block.entity.SignText.MESSAGES_CODEC; }
// public static void MESSAGES_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.block.entity.SignText.MESSAGES_CODEC = value; }

// public net.minecraft.text.Text[] messages() { return wrapperContained.messages; }
// public void messages(net.minecraft.text.Text[] value) { wrapperContained.messages = value; }
// public static net.minecraft.text.Text[] messages() { return net.minecraft.block.entity.SignText.messages; }
// public static void messages(net.minecraft.text.Text[] value, ) { net.minecraft.block.entity.SignText.messages = value; }

// public net.minecraft.text.Text[] filteredMessages() { return wrapperContained.filteredMessages; }
// public void filteredMessages(net.minecraft.text.Text[] value) { wrapperContained.filteredMessages = value; }
// public static net.minecraft.text.Text[] filteredMessages() { return net.minecraft.block.entity.SignText.filteredMessages; }
// public static void filteredMessages(net.minecraft.text.Text[] value, ) { net.minecraft.block.entity.SignText.filteredMessages = value; }

// public yarnwrap.util.DyeColor color() { return new yarnwrap.util.DyeColor(wrapperContained.color); }
// public void color(yarnwrap.util.DyeColor value) { wrapperContained.color = value.wrapperContained; }
// public static yarnwrap.util.DyeColor color() { return new yarnwrap.util.DyeColor(net.minecraft.block.entity.SignText.color); }
// public static void color(yarnwrap.util.DyeColor value, ) { net.minecraft.block.entity.SignText.color = value.wrapperContained; }

// public boolean glowing() { return wrapperContained.glowing; }
// public void glowing(boolean value) { wrapperContained.glowing = value; }
// public static boolean glowing() { return net.minecraft.block.entity.SignText.glowing; }
// public static void glowing(boolean value, ) { net.minecraft.block.entity.SignText.glowing = value; }

// public net.minecraft.text.OrderedText[] orderedMessages() { return wrapperContained.orderedMessages; }
// public void orderedMessages(net.minecraft.text.OrderedText[] value) { wrapperContained.orderedMessages = value; }
// public static net.minecraft.text.OrderedText[] orderedMessages() { return net.minecraft.block.entity.SignText.orderedMessages; }
// public static void orderedMessages(net.minecraft.text.OrderedText[] value, ) { net.minecraft.block.entity.SignText.orderedMessages = value; }

// public boolean filtered() { return wrapperContained.filtered; }
// public void filtered(boolean value) { wrapperContained.filtered = value; }
// public static boolean filtered() { return net.minecraft.block.entity.SignText.filtered; }
// public static void filtered(boolean value, ) { net.minecraft.block.entity.SignText.filtered = value; }

public SignText(net.minecraft.text.Text[] messages,net.minecraft.text.Text[] filteredMessages,yarnwrap.util.DyeColor color,boolean glowing) { this.wrapperContained = new net.minecraft.block.entity.SignText(messages,filteredMessages,color.wrapperContained,glowing); }
public boolean isGlowing() { return wrapperContained.isGlowing(); }
// public static boolean isGlowing() { return net.minecraft.block.entity.SignText.isGlowing(); }
public yarnwrap.block.entity.SignText withMessage(int line,yarnwrap.text.Text message) { return new yarnwrap.block.entity.SignText(wrapperContained.withMessage(line,message.wrapperContained)); }
// public static yarnwrap.block.entity.SignText withMessage(int line,yarnwrap.text.Text message, ) { return new yarnwrap.block.entity.SignText(net.minecraft.block.entity.SignText.withMessage(line,message.wrapperContained)); }
public yarnwrap.block.entity.SignText withMessage(int line,yarnwrap.text.Text message,yarnwrap.text.Text filteredMessage) { return new yarnwrap.block.entity.SignText(wrapperContained.withMessage(line,message.wrapperContained,filteredMessage.wrapperContained)); }
// public static yarnwrap.block.entity.SignText withMessage(int line,yarnwrap.text.Text message,yarnwrap.text.Text filteredMessage, ) { return new yarnwrap.block.entity.SignText(net.minecraft.block.entity.SignText.withMessage(line,message.wrapperContained,filteredMessage.wrapperContained)); }
public yarnwrap.text.Text getMessage(int line,boolean filtered) { return new yarnwrap.text.Text(wrapperContained.getMessage(line,filtered)); }
// public static yarnwrap.text.Text getMessage(int line,boolean filtered, ) { return new yarnwrap.text.Text(net.minecraft.block.entity.SignText.getMessage(line,filtered)); }
public boolean hasText(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.hasText(player.wrapperContained); }
// public static boolean hasText(yarnwrap.entity.player.PlayerEntity player, ) { return net.minecraft.block.entity.SignText.hasText(player.wrapperContained); }
public yarnwrap.block.entity.SignText withColor(yarnwrap.util.DyeColor color) { return new yarnwrap.block.entity.SignText(wrapperContained.withColor(color.wrapperContained)); }
// public static yarnwrap.block.entity.SignText withColor(yarnwrap.util.DyeColor color, ) { return new yarnwrap.block.entity.SignText(net.minecraft.block.entity.SignText.withColor(color.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_49863(Object instance) { return wrapperContained.method_49863(instance); }
// public static com.mojang.datafixers.kinds.App method_49863(Object instance, ) { return net.minecraft.block.entity.SignText.method_49863(instance); }
// public java.lang.Boolean method_49864(yarnwrap.block.entity.SignText signText) { return wrapperContained.method_49864(signText.wrapperContained); }
// public static java.lang.Boolean method_49864(yarnwrap.block.entity.SignText signText, ) { return net.minecraft.block.entity.SignText.method_49864(signText.wrapperContained); }
// public com.mojang.serialization.DataResult method_49865(java.util.List messages) { return wrapperContained.method_49865(messages); }
// public static com.mojang.serialization.DataResult method_49865(java.util.List messages, ) { return net.minecraft.block.entity.SignText.method_49865(messages); }
// public boolean method_49866(yarnwrap.text.Text text) { return wrapperContained.method_49866(text.wrapperContained); }
// public static boolean method_49866(yarnwrap.text.Text text, ) { return net.minecraft.block.entity.SignText.method_49866(text.wrapperContained); }
public yarnwrap.block.entity.SignText withGlowing(boolean glowing) { return new yarnwrap.block.entity.SignText(wrapperContained.withGlowing(glowing)); }
// public static yarnwrap.block.entity.SignText withGlowing(boolean glowing, ) { return new yarnwrap.block.entity.SignText(net.minecraft.block.entity.SignText.withGlowing(glowing)); }
public net.minecraft.text.OrderedText[] getOrderedMessages(boolean filtered,java.util.function.Function messageOrderer) { return wrapperContained.getOrderedMessages(filtered,messageOrderer); }
// public static net.minecraft.text.OrderedText[] getOrderedMessages(boolean filtered,java.util.function.Function messageOrderer, ) { return net.minecraft.block.entity.SignText.getOrderedMessages(filtered,messageOrderer); }
// public java.util.List method_49869(net.minecraft.text.Text[] messages) { return wrapperContained.method_49869(messages); }
// public static java.util.List method_49869(net.minecraft.text.Text[] messages, ) { return net.minecraft.block.entity.SignText.method_49869(messages); }
// public yarnwrap.block.entity.SignText create(net.minecraft.text.Text[] messages,java.util.Optional filteredMessages,yarnwrap.util.DyeColor color,boolean glowing) { return new yarnwrap.block.entity.SignText(wrapperContained.create(messages,filteredMessages,color.wrapperContained,glowing)); }
// public static yarnwrap.block.entity.SignText create(net.minecraft.text.Text[] messages,java.util.Optional filteredMessages,yarnwrap.util.DyeColor color,boolean glowing, ) { return new yarnwrap.block.entity.SignText(net.minecraft.block.entity.SignText.create(messages,filteredMessages,color.wrapperContained,glowing)); }
public yarnwrap.util.DyeColor getColor() { return new yarnwrap.util.DyeColor(wrapperContained.getColor()); }
// public static yarnwrap.util.DyeColor getColor() { return new yarnwrap.util.DyeColor(net.minecraft.block.entity.SignText.getColor()); }
public boolean hasRunCommandClickEvent(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.hasRunCommandClickEvent(player.wrapperContained); }
// public static boolean hasRunCommandClickEvent(yarnwrap.entity.player.PlayerEntity player, ) { return net.minecraft.block.entity.SignText.hasRunCommandClickEvent(player.wrapperContained); }
// public yarnwrap.util.DyeColor method_49875(yarnwrap.block.entity.SignText signText) { return new yarnwrap.util.DyeColor(wrapperContained.method_49875(signText.wrapperContained)); }
// public static yarnwrap.util.DyeColor method_49875(yarnwrap.block.entity.SignText signText, ) { return new yarnwrap.util.DyeColor(net.minecraft.block.entity.SignText.method_49875(signText.wrapperContained)); }
public net.minecraft.text.Text[] getMessages(boolean filtered) { return wrapperContained.getMessages(filtered); }
// public static net.minecraft.text.Text[] getMessages(boolean filtered, ) { return net.minecraft.block.entity.SignText.getMessages(filtered); }
// public net.minecraft.text.Text[] getDefaultText() { return wrapperContained.getDefaultText(); }
// public static net.minecraft.text.Text[] getDefaultText() { return net.minecraft.block.entity.SignText.getDefaultText(); }
// public net.minecraft.text.Text[] method_49879(yarnwrap.block.entity.SignText signText) { return wrapperContained.method_49879(signText.wrapperContained); }
// public static net.minecraft.text.Text[] method_49879(yarnwrap.block.entity.SignText signText, ) { return net.minecraft.block.entity.SignText.method_49879(signText.wrapperContained); }
// public java.util.Optional getFilteredMessages() { return wrapperContained.getFilteredMessages(); }
// public static java.util.Optional getFilteredMessages() { return net.minecraft.block.entity.SignText.getFilteredMessages(); }

}