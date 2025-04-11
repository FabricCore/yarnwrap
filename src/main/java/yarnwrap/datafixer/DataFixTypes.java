package yarnwrap.datafixer;
public class DataFixTypes { public net.minecraft.datafixer.DataFixTypes wrapperContained; public DataFixTypes(net.minecraft.datafixer.DataFixTypes wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object typeReference() { return wrapperContained.typeReference; }
// // public void typeReference(Object value) { wrapperContained.typeReference = value; }
public java.util.Set REQUIRED_TYPES() { return wrapperContained.REQUIRED_TYPES; }
// public void REQUIRED_TYPES(java.util.Set value) { wrapperContained.REQUIRED_TYPES = value; }
public com.mojang.serialization.Dynamic update(com.mojang.datafixers.DataFixer dataFixer,com.mojang.serialization.Dynamic dynamic,int oldVersion) { return wrapperContained.update(dataFixer,dynamic,oldVersion); }
public com.mojang.serialization.Dynamic update(com.mojang.datafixers.DataFixer dataFixer,com.mojang.serialization.Dynamic dynamic,int oldVersion,int newVersion) { return wrapperContained.update(dataFixer,dynamic,oldVersion,newVersion); }
public yarnwrap.nbt.NbtCompound update(com.mojang.datafixers.DataFixer dataFixer,yarnwrap.nbt.NbtCompound nbt,int oldVersion) { return new yarnwrap.nbt.NbtCompound(wrapperContained.update(dataFixer,nbt.wrapperContained,oldVersion)); }
public yarnwrap.nbt.NbtCompound update(com.mojang.datafixers.DataFixer dataFixer,yarnwrap.nbt.NbtCompound nbt,int oldVersion,int newVersion) { return new yarnwrap.nbt.NbtCompound(wrapperContained.update(dataFixer,nbt.wrapperContained,oldVersion,newVersion)); }
// public int getSaveVersionId() { return wrapperContained.getSaveVersionId(); }
public com.mojang.serialization.Codec createDataFixingCodec(com.mojang.serialization.Codec baseCodec,com.mojang.datafixers.DataFixer dataFixer,int currentDataVersion) { return wrapperContained.createDataFixingCodec(baseCodec,dataFixer,currentDataVersion); }

}