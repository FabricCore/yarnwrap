package yarnwrap.block.entity;
public class Spawner { public net.minecraft.block.entity.Spawner wrapperContained; public Spawner(net.minecraft.block.entity.Spawner wrapperContained) { this.wrapperContained = wrapperContained; }

public void setEntityType(yarnwrap.entity.EntityType type,yarnwrap.util.math.random.Random random) { wrapperContained.setEntityType(type.wrapperContained,random.wrapperContained); }
// public static void setEntityType(yarnwrap.entity.EntityType type,yarnwrap.util.math.random.Random random, ) { net.minecraft.block.entity.Spawner.setEntityType(type.wrapperContained,random.wrapperContained); }
// public yarnwrap.text.MutableText method_55119(yarnwrap.entity.EntityType entityType) { return new yarnwrap.text.MutableText(wrapperContained.method_55119(entityType.wrapperContained)); }
// public static yarnwrap.text.MutableText method_55119(yarnwrap.entity.EntityType entityType, ) { return new yarnwrap.text.MutableText(net.minecraft.block.entity.Spawner.method_55119(entityType.wrapperContained)); }
// public yarnwrap.text.Text getSpawnedEntityText(yarnwrap.item.ItemStack stack,java.lang.String spawnDataKey) { return new yarnwrap.text.Text(wrapperContained.getSpawnedEntityText(stack.wrapperContained,spawnDataKey)); }
// public static yarnwrap.text.Text getSpawnedEntityText(yarnwrap.item.ItemStack stack,java.lang.String spawnDataKey, ) { return new yarnwrap.text.Text(net.minecraft.block.entity.Spawner.getSpawnedEntityText(stack.wrapperContained,spawnDataKey)); }
// public void appendSpawnDataToTooltip(yarnwrap.item.ItemStack stack,java.util.List tooltip,java.lang.String spawnDataKey) { wrapperContained.appendSpawnDataToTooltip(stack.wrapperContained,tooltip,spawnDataKey); }
// public static void appendSpawnDataToTooltip(yarnwrap.item.ItemStack stack,java.util.List tooltip,java.lang.String spawnDataKey, ) { net.minecraft.block.entity.Spawner.appendSpawnDataToTooltip(stack.wrapperContained,tooltip,spawnDataKey); }
// // public yarnwrap.util.Identifier getSpawnedEntityId(yarnwrap.nbt.NbtCompound nbt,java.lang.String spawnDataKey) { return new yarnwrap.util.Identifier(wrapperContained.getSpawnedEntityId(nbt.wrapperContained,spawnDataKey)); }
// public static yarnwrap.util.Identifier getSpawnedEntityId(yarnwrap.nbt.NbtCompound nbt,java.lang.String spawnDataKey, ) { return new yarnwrap.util.Identifier(net.minecraft.block.entity.Spawner.getSpawnedEntityId(nbt.wrapperContained,spawnDataKey)); }

}