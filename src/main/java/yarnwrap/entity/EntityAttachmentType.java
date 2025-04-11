package yarnwrap.entity;
public class EntityAttachmentType { public net.minecraft.entity.EntityAttachmentType wrapperContained; public EntityAttachmentType(net.minecraft.entity.EntityAttachmentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object point() { return wrapperContained.point; }
// // public void point(Object value) { wrapperContained.point = value; }
// // public EntityAttachmentType(java.lang.String point) { this.wrapperContained = new net.minecraft.entity.EntityAttachmentType(point); }
public java.util.List createPoint(float width,float height) { return wrapperContained.createPoint(width,height); }

}