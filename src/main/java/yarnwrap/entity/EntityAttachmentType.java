package yarnwrap.entity;
public class EntityAttachmentType { public net.minecraft.entity.EntityAttachmentType wrapperContained; public EntityAttachmentType(net.minecraft.entity.EntityAttachmentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object point() { return wrapperContained.point; }
// // public void point(Object value) { wrapperContained.point = value; }
// // public static Object point() { return net.minecraft.entity.EntityAttachmentType.point; }
// // public static void point(Object value, ) { net.minecraft.entity.EntityAttachmentType.point = value; }

// // public EntityAttachmentType(java.lang.String point) { this.wrapperContained = new net.minecraft.entity.EntityAttachmentType(point); }
public java.util.List createPoint(float width,float height) { return wrapperContained.createPoint(width,height); }
// public static java.util.List createPoint(float width,float height, ) { return net.minecraft.entity.EntityAttachmentType.createPoint(width,height); }

}