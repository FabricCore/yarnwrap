package yarnwrap.block.entity;
public class Spawner { public net.minecraft.block.entity.Spawner wrapperContained; public Spawner(net.minecraft.block.entity.Spawner wrapperContained) { this.wrapperContained = wrapperContained; }

public void setEntityType(yarnwrap.entity.EntityType type,yarnwrap.util.math.random.Random random) { wrapperContained.setEntityType(type.wrapperContained,random.wrapperContained); }
// public static void setEntityType(yarnwrap.entity.EntityType type,yarnwrap.util.math.random.Random random, ) { net.minecraft.block.entity.Spawner.setEntityType(type.wrapperContained,random.wrapperContained); }
// public yarnwrap.text.MutableText method_55119(yarnwrap.entity.EntityType entityType) { return new yarnwrap.text.MutableText(wrapperContained.method_55119(entityType.wrapperContained)); }
// public static yarnwrap.text.MutableText method_55119(yarnwrap.entity.EntityType entityType, ) { return new yarnwrap.text.MutableText(net.minecraft.block.entity.Spawner.method_55119(entityType.wrapperContained)); }
// public yarnwrap.text.Text getSpawnedEntityText(yarnwrap.component.type.NbtComponent nbtComponent,java.lang.String spawnDataKey) { return new yarnwrap.text.Text(wrapperContained.getSpawnedEntityText(nbtComponent.wrapperContained,spawnDataKey)); }
// public static yarnwrap.text.Text getSpawnedEntityText(yarnwrap.component.type.NbtComponent nbtComponent,java.lang.String spawnDataKey, ) { return new yarnwrap.text.Text(net.minecraft.block.entity.Spawner.getSpawnedEntityText(nbtComponent.wrapperContained,spawnDataKey)); }
// public void appendSpawnDataToTooltip(yarnwrap.component.type.NbtComponent nbtComponent,java.util.function.Consumer textConsumer,java.lang.String spawnDataKey) { wrapperContained.appendSpawnDataToTooltip(nbtComponent.wrapperContained,textConsumer,spawnDataKey); }
// public static void appendSpawnDataToTooltip(yarnwrap.component.type.NbtComponent nbtComponent,java.util.function.Consumer textConsumer,java.lang.String spawnDataKey, ) { net.minecraft.block.entity.Spawner.appendSpawnDataToTooltip(nbtComponent.wrapperContained,textConsumer,spawnDataKey); }
// public java.util.Optional method_68279(yarnwrap.nbt.NbtCompound entityNbt) { return wrapperContained.method_68279(entityNbt.wrapperContained); }
// public static java.util.Optional method_68279(yarnwrap.nbt.NbtCompound entityNbt, ) { return net.minecraft.block.entity.Spawner.method_68279(entityNbt.wrapperContained); }
// public java.util.Optional method_68280(yarnwrap.nbt.NbtCompound spawnDataNbt) { return wrapperContained.method_68280(spawnDataNbt.wrapperContained); }
// public static java.util.Optional method_68280(yarnwrap.nbt.NbtCompound spawnDataNbt, ) { return net.minecraft.block.entity.Spawner.method_68280(spawnDataNbt.wrapperContained); }

}