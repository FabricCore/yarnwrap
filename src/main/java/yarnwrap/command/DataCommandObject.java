package yarnwrap.command;
public class DataCommandObject { public net.minecraft.command.DataCommandObject wrapperContained; public DataCommandObject(net.minecraft.command.DataCommandObject wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text feedbackGet(Object path,double scale,int result) { return new yarnwrap.text.Text(wrapperContained.feedbackGet(path,scale,result)); }
// public static yarnwrap.text.Text feedbackGet(Object path,double scale,int result, ) { return new yarnwrap.text.Text(net.minecraft.command.DataCommandObject.feedbackGet(path,scale,result)); }
// public void setNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.setNbt(nbt.wrapperContained); }
// public static void setNbt(yarnwrap.nbt.NbtCompound nbt, ) { net.minecraft.command.DataCommandObject.setNbt(nbt.wrapperContained); }
// public yarnwrap.nbt.NbtCompound getNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.getNbt()); }
// public static yarnwrap.nbt.NbtCompound getNbt() { return new yarnwrap.nbt.NbtCompound(net.minecraft.command.DataCommandObject.getNbt()); }
public yarnwrap.text.Text feedbackQuery(yarnwrap.nbt.NbtElement element) { return new yarnwrap.text.Text(wrapperContained.feedbackQuery(element.wrapperContained)); }
// public static yarnwrap.text.Text feedbackQuery(yarnwrap.nbt.NbtElement element, ) { return new yarnwrap.text.Text(net.minecraft.command.DataCommandObject.feedbackQuery(element.wrapperContained)); }
public yarnwrap.text.Text feedbackModify() { return new yarnwrap.text.Text(wrapperContained.feedbackModify()); }
// public static yarnwrap.text.Text feedbackModify() { return new yarnwrap.text.Text(net.minecraft.command.DataCommandObject.feedbackModify()); }

}