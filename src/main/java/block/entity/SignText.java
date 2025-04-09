package yarnwrap.block.entity;
public class SignText { public net.minecraft.block.entity.SignText wrapperContained; public SignText(net.minecraft.block.entity.SignText wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public com.mojang.serialization.Codec MESSAGES_CODEC() { return wrapperContained.MESSAGES_CODEC; }
// public net.minecraft.text.Text[] messages() { return wrapperContained.messages; }
// public net.minecraft.text.Text[] filteredMessages() { return wrapperContained.filteredMessages; }
// public yarnwrap.util.DyeColor color() { return new yarnwrap.util.DyeColor(wrapperContained.color); }
// public boolean glowing() { return wrapperContained.glowing; }
// public net.minecraft.text.OrderedText[] orderedMessages() { return wrapperContained.orderedMessages; }
// public boolean filtered() { return wrapperContained.filtered; }
public boolean isGlowing() { return wrapperContained.isGlowing(); }
public yarnwrap.block.entity.SignText withMessage(int line,yarnwrap.text.Text message) { return new yarnwrap.block.entity.SignText(wrapperContained.withMessage(line,message.wrapperContained)); }
public yarnwrap.block.entity.SignText withMessage(int line,yarnwrap.text.Text message,yarnwrap.text.Text filteredMessage) { return new yarnwrap.block.entity.SignText(wrapperContained.withMessage(line,message.wrapperContained,filteredMessage.wrapperContained)); }
public yarnwrap.text.Text getMessage(int line,boolean filtered) { return new yarnwrap.text.Text(wrapperContained.getMessage(line,filtered)); }
public boolean hasText(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.hasText(player.wrapperContained); }
public yarnwrap.block.entity.SignText withColor(yarnwrap.util.DyeColor color) { return new yarnwrap.block.entity.SignText(wrapperContained.withColor(color.wrapperContained)); }
public yarnwrap.block.entity.SignText withGlowing(boolean glowing) { return new yarnwrap.block.entity.SignText(wrapperContained.withGlowing(glowing)); }
public net.minecraft.text.OrderedText[] getOrderedMessages(boolean filtered,java.util.function.Function messageOrderer) { return wrapperContained.getOrderedMessages(filtered,messageOrderer); }
// public yarnwrap.block.entity.SignText create(net.minecraft.text.Text[] messages,java.util.Optional filteredMessages,yarnwrap.util.DyeColor color,boolean glowing) { return new yarnwrap.block.entity.SignText(wrapperContained.create(messages,filteredMessages,color.wrapperContained,glowing)); }
public yarnwrap.util.DyeColor getColor() { return new yarnwrap.util.DyeColor(wrapperContained.getColor()); }
public boolean hasRunCommandClickEvent(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.hasRunCommandClickEvent(player.wrapperContained); }
public net.minecraft.text.Text[] getMessages(boolean filtered) { return wrapperContained.getMessages(filtered); }
// public net.minecraft.text.Text[] getDefaultText() { return wrapperContained.getDefaultText(); }
// public java.util.Optional getFilteredMessages() { return wrapperContained.getFilteredMessages(); }

}