package yarnwrap.client.render.entity.feature;
public class VillagerResourceMetadata { public net.minecraft.client.render.entity.feature.VillagerResourceMetadata wrapperContained; public VillagerResourceMetadata(net.minecraft.client.render.entity.feature.VillagerResourceMetadata wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.feature.VillagerResourceMetadataReader READER() { return new yarnwrap.client.render.entity.feature.VillagerResourceMetadataReader(wrapperContained.READER); }
// public void READER(yarnwrap.client.render.entity.feature.VillagerResourceMetadataReader value) { wrapperContained.READER = value.wrapperContained; }
public static yarnwrap.client.render.entity.feature.VillagerResourceMetadataReader READER() { return new yarnwrap.client.render.entity.feature.VillagerResourceMetadataReader(net.minecraft.client.render.entity.feature.VillagerResourceMetadata.READER); }
// public static void READER(yarnwrap.client.render.entity.feature.VillagerResourceMetadataReader value, ) { net.minecraft.client.render.entity.feature.VillagerResourceMetadata.READER = value.wrapperContained; }

// public Object hatType() { return wrapperContained.hatType; }
// // public void hatType(Object value) { wrapperContained.hatType = value; }
// // public static Object hatType() { return net.minecraft.client.render.entity.feature.VillagerResourceMetadata.hatType; }
// // public static void hatType(Object value, ) { net.minecraft.client.render.entity.feature.VillagerResourceMetadata.hatType = value; }

// public java.lang.String KEY() { return wrapperContained.KEY; }
// public void KEY(java.lang.String value) { wrapperContained.KEY = value; }
public static java.lang.String KEY() { return net.minecraft.client.render.entity.feature.VillagerResourceMetadata.KEY; }
// public static void KEY(java.lang.String value, ) { net.minecraft.client.render.entity.feature.VillagerResourceMetadata.KEY = value; }

// public VillagerResourceMetadata(Object hatType) { this.wrapperContained = new net.minecraft.client.render.entity.feature.VillagerResourceMetadata(hatType); }
public Object getHatType() { return wrapperContained.getHatType(); }
// public static Object getHatType() { return net.minecraft.client.render.entity.feature.VillagerResourceMetadata.getHatType(); }

}