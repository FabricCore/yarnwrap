package yarnwrap.world.entity;
public class UniquelyIdentifiable { public net.minecraft.world.entity.UniquelyIdentifiable wrapperContained; public UniquelyIdentifiable(net.minecraft.world.entity.UniquelyIdentifiable wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.UUID getUuid() { return wrapperContained.getUuid(); }
// public static java.util.UUID getUuid() { return net.minecraft.world.entity.UniquelyIdentifiable.getUuid(); }
public boolean isRemoved() { return wrapperContained.isRemoved(); }
// public static boolean isRemoved() { return net.minecraft.world.entity.UniquelyIdentifiable.isRemoved(); }

}