package yarnwrap.block.entity;
public class SignBlockEntity { public net.minecraft.block.entity.SignBlockEntity wrapperContained; public SignBlockEntity(net.minecraft.block.entity.SignBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.UUID editor() { return wrapperContained.editor; }
// public void editor(java.util.UUID value) { wrapperContained.editor = value; }
// public int MAX_TEXT_WIDTH() { return wrapperContained.MAX_TEXT_WIDTH; }
// public void MAX_TEXT_WIDTH(int value) { wrapperContained.MAX_TEXT_WIDTH = value; }
// public int TEXT_LINE_HEIGHT() { return wrapperContained.TEXT_LINE_HEIGHT; }
// public void TEXT_LINE_HEIGHT(int value) { wrapperContained.TEXT_LINE_HEIGHT = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.block.entity.SignText frontText() { return new yarnwrap.block.entity.SignText(wrapperContained.frontText); }
// public void frontText(yarnwrap.block.entity.SignText value) { wrapperContained.frontText = value.wrapperContained; }
// public yarnwrap.block.entity.SignText backText() { return new yarnwrap.block.entity.SignText(wrapperContained.backText); }
// public void backText(yarnwrap.block.entity.SignText value) { wrapperContained.backText = value.wrapperContained; }
// public boolean waxed() { return wrapperContained.waxed; }
// public void waxed(boolean value) { wrapperContained.waxed = value; }
public SignBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.SignBlockEntity(pos.wrapperContained,state.wrapperContained); }
public java.util.UUID getEditor() { return wrapperContained.getEditor(); }
public void setEditor(java.util.UUID editor) { wrapperContained.setEditor(editor); }
// public void updateListeners() { wrapperContained.updateListeners(); }
public int getTextLineHeight() { return wrapperContained.getTextLineHeight(); }
public int getMaxTextWidth() { return wrapperContained.getMaxTextWidth(); }
public boolean isPlayerFacingFront(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.isPlayerFacingFront(player.wrapperContained); }
// public yarnwrap.block.entity.SignText getTextWithMessages(yarnwrap.entity.player.PlayerEntity player,java.util.List messages,yarnwrap.block.entity.SignText text) { return new yarnwrap.block.entity.SignText(wrapperContained.getTextWithMessages(player.wrapperContained,messages,text.wrapperContained)); }
public void tryChangeText(yarnwrap.entity.player.PlayerEntity player,boolean front,java.util.List messages) { wrapperContained.tryChangeText(player.wrapperContained,front,messages); }
public void tick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.SignBlockEntity blockEntity) { wrapperContained.tick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public void tryClearInvalidEditor(yarnwrap.block.entity.SignBlockEntity blockEntity,yarnwrap.world.World world,java.util.UUID uuid) { wrapperContained.tryClearInvalidEditor(blockEntity.wrapperContained,world.wrapperContained,uuid); }
// public boolean setBackText(yarnwrap.block.entity.SignText backText) { return wrapperContained.setBackText(backText.wrapperContained); }
public boolean setText(yarnwrap.block.entity.SignText text,boolean front) { return wrapperContained.setText(text.wrapperContained,front); }
public boolean changeText(java.util.function.UnaryOperator textChanger,boolean front) { return wrapperContained.changeText(textChanger,front); }
// public void method_49842(yarnwrap.nbt.NbtCompound backText) { wrapperContained.method_49842(backText.wrapperContained); }
public yarnwrap.block.entity.SignText getText(boolean front) { return new yarnwrap.block.entity.SignText(wrapperContained.getText(front)); }
// public yarnwrap.block.entity.SignText method_49845(yarnwrap.entity.player.PlayerEntity text) { return new yarnwrap.block.entity.SignText(wrapperContained.method_49845(text.wrapperContained)); }
// public boolean setFrontText(yarnwrap.block.entity.SignText frontText) { return wrapperContained.setFrontText(frontText.wrapperContained); }
public boolean isPlayerTooFarToEdit(java.util.UUID uuid) { return wrapperContained.isPlayerTooFarToEdit(uuid); }
// public void method_49848(yarnwrap.nbt.NbtCompound frontText) { wrapperContained.method_49848(frontText.wrapperContained); }
public boolean setWaxed(boolean waxed) { return wrapperContained.setWaxed(waxed); }
// public void method_49850(yarnwrap.block.entity.SignText signText) { wrapperContained.method_49850(signText.wrapperContained); }
// public void method_49851(yarnwrap.block.entity.SignText signText) { wrapperContained.method_49851(signText.wrapperContained); }
// public yarnwrap.block.entity.SignText createText() { return new yarnwrap.block.entity.SignText(wrapperContained.createText()); }
public yarnwrap.block.entity.SignText getFrontText() { return new yarnwrap.block.entity.SignText(wrapperContained.getFrontText()); }
public yarnwrap.block.entity.SignText getBackText() { return new yarnwrap.block.entity.SignText(wrapperContained.getBackText()); }
public boolean isWaxed() { return wrapperContained.isWaxed(); }
// public yarnwrap.server.command.ServerCommandSource createCommandSource(yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.createCommandSource(player.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
public boolean runCommandClickEvent(yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean front) { return wrapperContained.runCommandClickEvent(player.wrapperContained,world.wrapperContained,pos.wrapperContained,front); }
// public yarnwrap.block.entity.SignText parseLines(yarnwrap.block.entity.SignText signText) { return new yarnwrap.block.entity.SignText(wrapperContained.parseLines(signText.wrapperContained)); }
// public yarnwrap.text.Text parseLine(yarnwrap.text.Text text) { return new yarnwrap.text.Text(wrapperContained.parseLine(text.wrapperContained)); }
public boolean canRunCommandClickEvent(boolean front,yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.canRunCommandClickEvent(front,player.wrapperContained); }
public yarnwrap.sound.SoundEvent getInteractionFailSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getInteractionFailSound()); }

}