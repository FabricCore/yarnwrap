package yarnwrap.nbt.visitor;
public class NbtElementVisitor { public net.minecraft.nbt.visitor.NbtElementVisitor wrapperContained; public NbtElementVisitor(net.minecraft.nbt.visitor.NbtElementVisitor wrapperContained) { this.wrapperContained = wrapperContained; }

public void visitByteArray(yarnwrap.nbt.NbtByteArray element) { wrapperContained.visitByteArray(element.wrapperContained); }
public void visitByte(yarnwrap.nbt.NbtByte element) { wrapperContained.visitByte(element.wrapperContained); }
public void visitCompound(yarnwrap.nbt.NbtCompound compound) { wrapperContained.visitCompound(compound.wrapperContained); }
public void visitDouble(yarnwrap.nbt.NbtDouble element) { wrapperContained.visitDouble(element.wrapperContained); }
public void visitEnd(yarnwrap.nbt.NbtEnd element) { wrapperContained.visitEnd(element.wrapperContained); }
public void visitFloat(yarnwrap.nbt.NbtFloat element) { wrapperContained.visitFloat(element.wrapperContained); }
public void visitIntArray(yarnwrap.nbt.NbtIntArray element) { wrapperContained.visitIntArray(element.wrapperContained); }
public void visitInt(yarnwrap.nbt.NbtInt element) { wrapperContained.visitInt(element.wrapperContained); }
public void visitList(yarnwrap.nbt.NbtList element) { wrapperContained.visitList(element.wrapperContained); }
public void visitLongArray(yarnwrap.nbt.NbtLongArray element) { wrapperContained.visitLongArray(element.wrapperContained); }
public void visitLong(yarnwrap.nbt.NbtLong element) { wrapperContained.visitLong(element.wrapperContained); }
public void visitShort(yarnwrap.nbt.NbtShort element) { wrapperContained.visitShort(element.wrapperContained); }
public void visitString(yarnwrap.nbt.NbtString element) { wrapperContained.visitString(element.wrapperContained); }

}