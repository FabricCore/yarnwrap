package yarnwrap.block.entity;
public class SignBlockEntity { public net.minecraft.block.entity.SignBlockEntity wrapperContained; public SignBlockEntity(net.minecraft.block.entity.SignBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.UUID editor() { return wrapperContained.editor; }
// public void editor(java.util.UUID value) { wrapperContained.editor = value; }
// public static java.util.UUID editor() { return net.minecraft.block.entity.SignBlockEntity.editor; }
// public static void editor(java.util.UUID value, ) { net.minecraft.block.entity.SignBlockEntity.editor = value; }

// public int MAX_TEXT_WIDTH() { return wrapperContained.MAX_TEXT_WIDTH; }
// public void MAX_TEXT_WIDTH(int value) { wrapperContained.MAX_TEXT_WIDTH = value; }
// public static int MAX_TEXT_WIDTH() { return net.minecraft.block.entity.SignBlockEntity.MAX_TEXT_WIDTH; }
// public static void MAX_TEXT_WIDTH(int value, ) { net.minecraft.block.entity.SignBlockEntity.MAX_TEXT_WIDTH = value; }

// public int TEXT_LINE_HEIGHT() { return wrapperContained.TEXT_LINE_HEIGHT; }
// public void TEXT_LINE_HEIGHT(int value) { wrapperContained.TEXT_LINE_HEIGHT = value; }
// public static int TEXT_LINE_HEIGHT() { return net.minecraft.block.entity.SignBlockEntity.TEXT_LINE_HEIGHT; }
// public static void TEXT_LINE_HEIGHT(int value, ) { net.minecraft.block.entity.SignBlockEntity.TEXT_LINE_HEIGHT = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.block.entity.SignBlockEntity.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.block.entity.SignBlockEntity.LOGGER = value; }

// public yarnwrap.block.entity.SignText frontText() { return new yarnwrap.block.entity.SignText(wrapperContained.frontText); }
// public void frontText(yarnwrap.block.entity.SignText value) { wrapperContained.frontText = value.wrapperContained; }
// public static yarnwrap.block.entity.SignText frontText() { return new yarnwrap.block.entity.SignText(net.minecraft.block.entity.SignBlockEntity.frontText); }
// public static void frontText(yarnwrap.block.entity.SignText value, ) { net.minecraft.block.entity.SignBlockEntity.frontText = value.wrapperContained; }

// public yarnwrap.block.entity.SignText backText() { return new yarnwrap.block.entity.SignText(wrapperContained.backText); }
// public void backText(yarnwrap.block.entity.SignText value) { wrapperContained.backText = value.wrapperContained; }
// public static yarnwrap.block.entity.SignText backText() { return new yarnwrap.block.entity.SignText(net.minecraft.block.entity.SignBlockEntity.backText); }
// public static void backText(yarnwrap.block.entity.SignText value, ) { net.minecraft.block.entity.SignBlockEntity.backText = value.wrapperContained; }

// public boolean waxed() { return wrapperContained.waxed; }
// public void waxed(boolean value) { wrapperContained.waxed = value; }
// public static boolean waxed() { return net.minecraft.block.entity.SignBlockEntity.waxed; }
// public static void waxed(boolean value, ) { net.minecraft.block.entity.SignBlockEntity.waxed = value; }

public SignBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.SignBlockEntity(pos.wrapperContained,state.wrapperContained); }
public java.util.UUID getEditor() { return wrapperContained.getEditor(); }
// public static java.util.UUID getEditor() { return net.minecraft.block.entity.SignBlockEntity.getEditor(); }
public void setEditor(java.util.UUID editor) { wrapperContained.setEditor(editor); }
// public static void setEditor(java.util.UUID editor, ) { net.minecraft.block.entity.SignBlockEntity.setEditor(editor); }
// public void updateListeners() { wrapperContained.updateListeners(); }
// public static void updateListeners() { net.minecraft.block.entity.SignBlockEntity.updateListeners(); }
public int getTextLineHeight() { return wrapperContained.getTextLineHeight(); }
// public static int getTextLineHeight() { return net.minecraft.block.entity.SignBlockEntity.getTextLineHeight(); }
public int getMaxTextWidth() { return wrapperContained.getMaxTextWidth(); }
// public static int getMaxTextWidth() { return net.minecraft.block.entity.SignBlockEntity.getMaxTextWidth(); }
public boolean isPlayerFacingFront(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.isPlayerFacingFront(player.wrapperContained); }
// public static boolean isPlayerFacingFront(yarnwrap.entity.player.PlayerEntity player, ) { return net.minecraft.block.entity.SignBlockEntity.isPlayerFacingFront(player.wrapperContained); }
// public yarnwrap.block.entity.SignText getTextWithMessages(yarnwrap.entity.player.PlayerEntity player,java.util.List messages,yarnwrap.block.entity.SignText text) { return new yarnwrap.block.entity.SignText(wrapperContained.getTextWithMessages(player.wrapperContained,messages,text.wrapperContained)); }
// public static yarnwrap.block.entity.SignText getTextWithMessages(yarnwrap.entity.player.PlayerEntity player,java.util.List messages,yarnwrap.block.entity.SignText text, ) { return new yarnwrap.block.entity.SignText(net.minecraft.block.entity.SignBlockEntity.getTextWithMessages(player.wrapperContained,messages,text.wrapperContained)); }
public void tryChangeText(yarnwrap.entity.player.PlayerEntity player,boolean front,java.util.List messages) { wrapperContained.tryChangeText(player.wrapperContained,front,messages); }
// public static void tryChangeText(yarnwrap.entity.player.PlayerEntity player,boolean front,java.util.List messages, ) { net.minecraft.block.entity.SignBlockEntity.tryChangeText(player.wrapperContained,front,messages); }
// public void tick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.SignBlockEntity blockEntity) { wrapperContained.tick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public static void tick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.SignBlockEntity blockEntity, ) { net.minecraft.block.entity.SignBlockEntity.tick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public void tryClearInvalidEditor(yarnwrap.block.entity.SignBlockEntity blockEntity,yarnwrap.world.World world,java.util.UUID uuid) { wrapperContained.tryClearInvalidEditor(blockEntity.wrapperContained,world.wrapperContained,uuid); }
// public static void tryClearInvalidEditor(yarnwrap.block.entity.SignBlockEntity blockEntity,yarnwrap.world.World world,java.util.UUID uuid, ) { net.minecraft.block.entity.SignBlockEntity.tryClearInvalidEditor(blockEntity.wrapperContained,world.wrapperContained,uuid); }
// public boolean setBackText(yarnwrap.block.entity.SignText backText) { return wrapperContained.setBackText(backText.wrapperContained); }
// public static boolean setBackText(yarnwrap.block.entity.SignText backText, ) { return net.minecraft.block.entity.SignBlockEntity.setBackText(backText.wrapperContained); }
public boolean setText(yarnwrap.block.entity.SignText text,boolean front) { return wrapperContained.setText(text.wrapperContained,front); }
// public static boolean setText(yarnwrap.block.entity.SignText text,boolean front, ) { return net.minecraft.block.entity.SignBlockEntity.setText(text.wrapperContained,front); }
public boolean changeText(java.util.function.UnaryOperator textChanger,boolean front) { return wrapperContained.changeText(textChanger,front); }
// public static boolean changeText(java.util.function.UnaryOperator textChanger,boolean front, ) { return net.minecraft.block.entity.SignBlockEntity.changeText(textChanger,front); }
// public void method_49842(yarnwrap.nbt.NbtCompound backText) { wrapperContained.method_49842(backText.wrapperContained); }
// public static void method_49842(yarnwrap.nbt.NbtCompound backText, ) { net.minecraft.block.entity.SignBlockEntity.method_49842(backText.wrapperContained); }
public yarnwrap.block.entity.SignText getText(boolean front) { return new yarnwrap.block.entity.SignText(wrapperContained.getText(front)); }
// public static yarnwrap.block.entity.SignText getText(boolean front, ) { return new yarnwrap.block.entity.SignText(net.minecraft.block.entity.SignBlockEntity.getText(front)); }
// public yarnwrap.block.entity.SignText method_49845(yarnwrap.entity.player.PlayerEntity text) { return new yarnwrap.block.entity.SignText(wrapperContained.method_49845(text.wrapperContained)); }
// public static yarnwrap.block.entity.SignText method_49845(yarnwrap.entity.player.PlayerEntity text, ) { return new yarnwrap.block.entity.SignText(net.minecraft.block.entity.SignBlockEntity.method_49845(text.wrapperContained)); }
// public boolean setFrontText(yarnwrap.block.entity.SignText frontText) { return wrapperContained.setFrontText(frontText.wrapperContained); }
// public static boolean setFrontText(yarnwrap.block.entity.SignText frontText, ) { return net.minecraft.block.entity.SignBlockEntity.setFrontText(frontText.wrapperContained); }
public boolean isPlayerTooFarToEdit(java.util.UUID uuid) { return wrapperContained.isPlayerTooFarToEdit(uuid); }
// public static boolean isPlayerTooFarToEdit(java.util.UUID uuid, ) { return net.minecraft.block.entity.SignBlockEntity.isPlayerTooFarToEdit(uuid); }
// public void method_49848(yarnwrap.nbt.NbtCompound frontText) { wrapperContained.method_49848(frontText.wrapperContained); }
// public static void method_49848(yarnwrap.nbt.NbtCompound frontText, ) { net.minecraft.block.entity.SignBlockEntity.method_49848(frontText.wrapperContained); }
public boolean setWaxed(boolean waxed) { return wrapperContained.setWaxed(waxed); }
// public static boolean setWaxed(boolean waxed, ) { return net.minecraft.block.entity.SignBlockEntity.setWaxed(waxed); }
// public void method_49850(yarnwrap.block.entity.SignText signText) { wrapperContained.method_49850(signText.wrapperContained); }
// public static void method_49850(yarnwrap.block.entity.SignText signText, ) { net.minecraft.block.entity.SignBlockEntity.method_49850(signText.wrapperContained); }
// public void method_49851(yarnwrap.block.entity.SignText signText) { wrapperContained.method_49851(signText.wrapperContained); }
// public static void method_49851(yarnwrap.block.entity.SignText signText, ) { net.minecraft.block.entity.SignBlockEntity.method_49851(signText.wrapperContained); }
// public yarnwrap.block.entity.SignText createText() { return new yarnwrap.block.entity.SignText(wrapperContained.createText()); }
// public static yarnwrap.block.entity.SignText createText() { return new yarnwrap.block.entity.SignText(net.minecraft.block.entity.SignBlockEntity.createText()); }
public yarnwrap.block.entity.SignText getFrontText() { return new yarnwrap.block.entity.SignText(wrapperContained.getFrontText()); }
// public static yarnwrap.block.entity.SignText getFrontText() { return new yarnwrap.block.entity.SignText(net.minecraft.block.entity.SignBlockEntity.getFrontText()); }
public yarnwrap.block.entity.SignText getBackText() { return new yarnwrap.block.entity.SignText(wrapperContained.getBackText()); }
// public static yarnwrap.block.entity.SignText getBackText() { return new yarnwrap.block.entity.SignText(net.minecraft.block.entity.SignBlockEntity.getBackText()); }
public boolean isWaxed() { return wrapperContained.isWaxed(); }
// public static boolean isWaxed() { return net.minecraft.block.entity.SignBlockEntity.isWaxed(); }
// public yarnwrap.server.command.ServerCommandSource createCommandSource(yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.createCommandSource(player.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.server.command.ServerCommandSource createCommandSource(yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.server.command.ServerCommandSource(net.minecraft.block.entity.SignBlockEntity.createCommandSource(player.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
public boolean runCommandClickEvent(yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean front) { return wrapperContained.runCommandClickEvent(player.wrapperContained,world.wrapperContained,pos.wrapperContained,front); }
// public static boolean runCommandClickEvent(yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean front, ) { return net.minecraft.block.entity.SignBlockEntity.runCommandClickEvent(player.wrapperContained,world.wrapperContained,pos.wrapperContained,front); }
// public yarnwrap.block.entity.SignText parseLines(yarnwrap.block.entity.SignText signText) { return new yarnwrap.block.entity.SignText(wrapperContained.parseLines(signText.wrapperContained)); }
// public static yarnwrap.block.entity.SignText parseLines(yarnwrap.block.entity.SignText signText, ) { return new yarnwrap.block.entity.SignText(net.minecraft.block.entity.SignBlockEntity.parseLines(signText.wrapperContained)); }
// public yarnwrap.text.Text parseLine(yarnwrap.text.Text text) { return new yarnwrap.text.Text(wrapperContained.parseLine(text.wrapperContained)); }
// public static yarnwrap.text.Text parseLine(yarnwrap.text.Text text, ) { return new yarnwrap.text.Text(net.minecraft.block.entity.SignBlockEntity.parseLine(text.wrapperContained)); }
public boolean canRunCommandClickEvent(boolean front,yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.canRunCommandClickEvent(front,player.wrapperContained); }
// public static boolean canRunCommandClickEvent(boolean front,yarnwrap.entity.player.PlayerEntity player, ) { return net.minecraft.block.entity.SignBlockEntity.canRunCommandClickEvent(front,player.wrapperContained); }
public yarnwrap.sound.SoundEvent getInteractionFailSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getInteractionFailSound()); }
// public static yarnwrap.sound.SoundEvent getInteractionFailSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.block.entity.SignBlockEntity.getInteractionFailSound()); }

}