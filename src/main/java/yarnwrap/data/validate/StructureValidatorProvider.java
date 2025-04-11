package yarnwrap.data.validate;
public class StructureValidatorProvider { public net.minecraft.data.validate.StructureValidatorProvider wrapperContained; public StructureValidatorProvider(net.minecraft.data.validate.StructureValidatorProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.lang.String PATH_PREFIX() { return wrapperContained.PATH_PREFIX; }
// public void PATH_PREFIX(java.lang.String value) { wrapperContained.PATH_PREFIX = value; }
public yarnwrap.nbt.NbtCompound update(java.lang.String name,yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.nbt.NbtCompound(wrapperContained.update(name,nbt.wrapperContained)); }

}