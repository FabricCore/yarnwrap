package yarnwrap.command;
public class DataCommandObject { public net.minecraft.command.DataCommandObject wrapperContained; public DataCommandObject(net.minecraft.command.DataCommandObject wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text feedbackGet(Object path,double scale,int result) { return new yarnwrap.text.Text(wrapperContained.feedbackGet(path,scale,result)); }
// public void setNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.setNbt(nbt.wrapperContained); }
// public yarnwrap.nbt.NbtCompound getNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.getNbt()); }
public yarnwrap.text.Text feedbackQuery(yarnwrap.nbt.NbtElement element) { return new yarnwrap.text.Text(wrapperContained.feedbackQuery(element.wrapperContained)); }
public yarnwrap.text.Text feedbackModify() { return new yarnwrap.text.Text(wrapperContained.feedbackModify()); }

}