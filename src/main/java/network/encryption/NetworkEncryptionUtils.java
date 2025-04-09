package yarnwrap.network.encryption;
public class NetworkEncryptionUtils { public net.minecraft.network.encryption.NetworkEncryptionUtils wrapperContained; public NetworkEncryptionUtils(net.minecraft.network.encryption.NetworkEncryptionUtils wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String AES() { return wrapperContained.AES; }
// public int AES_KEY_LENGTH() { return wrapperContained.AES_KEY_LENGTH; }
// public java.lang.String RSA() { return wrapperContained.RSA; }
// public int RSA_KEY_LENGTH() { return wrapperContained.RSA_KEY_LENGTH; }
// public java.lang.String ISO_8859_1() { return wrapperContained.ISO_8859_1; }
// public java.lang.String SHA1() { return wrapperContained.SHA1; }
public java.lang.String RSA_PUBLIC_KEY_PREFIX() { return wrapperContained.RSA_PUBLIC_KEY_PREFIX; }
public java.lang.String LINEBREAK() { return wrapperContained.LINEBREAK; }
public com.mojang.serialization.Codec RSA_PUBLIC_KEY_CODEC() { return wrapperContained.RSA_PUBLIC_KEY_CODEC; }
public com.mojang.serialization.Codec RSA_PRIVATE_KEY_CODEC() { return wrapperContained.RSA_PRIVATE_KEY_CODEC; }
// public java.lang.String RSA_PRIVATE_KEY_PREFIX() { return wrapperContained.RSA_PRIVATE_KEY_PREFIX; }
// public java.lang.String RSA_PRIVATE_KEY_SUFFIX() { return wrapperContained.RSA_PRIVATE_KEY_SUFFIX; }
// public java.lang.String RSA_PUBLIC_KEY_SUFFIX() { return wrapperContained.RSA_PUBLIC_KEY_SUFFIX; }
public java.lang.String SHA256_WITH_RSA() { return wrapperContained.SHA256_WITH_RSA; }
public Object BASE64_ENCODER() { return wrapperContained.BASE64_ENCODER; }
public int SHA256_BITS() { return wrapperContained.SHA256_BITS; }
// public javax.crypto.SecretKey decryptSecretKey(java.security.PrivateKey privateKey,byte encryptedSecretKey) { return wrapperContained.decryptSecretKey(privateKey,encryptedSecretKey); }
// public javax.crypto.Cipher cipherFromKey(int opMode,java.security.Key key) { return wrapperContained.cipherFromKey(opMode,key); }
// public byte[] hash(byte bytes) { return wrapperContained.hash(bytes); }
// public java.security.KeyPair generateServerKeyPair() { return wrapperContained.generateServerKeyPair(); }
// public byte[] encrypt(java.security.Key key,byte data) { return wrapperContained.encrypt(key,data); }
// public javax.crypto.SecretKey generateSecretKey() { return wrapperContained.generateSecretKey(); }
// public byte[] computeServerId(java.lang.String baseServerId,java.security.PublicKey publicKey,javax.crypto.SecretKey secretKey) { return wrapperContained.computeServerId(baseServerId,publicKey,secretKey); }
// public javax.crypto.Cipher createCipher(int opMode,java.lang.String algorithm,java.security.Key key) { return wrapperContained.createCipher(opMode,algorithm,key); }
// public java.security.PublicKey decodeEncodedRsaPublicKey(byte key) { return wrapperContained.decodeEncodedRsaPublicKey(key); }
// public byte[] decrypt(java.security.Key key,byte data) { return wrapperContained.decrypt(key,data); }
// public byte[] crypt(int opMode,java.security.Key key,byte data) { return wrapperContained.crypt(opMode,key,data); }
// public java.security.PrivateKey decodeRsaPrivateKeyPem(java.lang.String key) { return wrapperContained.decodeRsaPrivateKeyPem(key); }
// public java.security.Key decodePem(java.lang.String key,java.lang.String prefix,java.lang.String suffix,Object decoder) { return wrapperContained.decodePem(key,prefix,suffix,decoder); }
public java.lang.String encodeRsaPrivateKey(java.security.PrivateKey key) { return wrapperContained.encodeRsaPrivateKey(key); }
public java.lang.String encodeRsaPublicKey(java.security.PublicKey key) { return wrapperContained.encodeRsaPublicKey(key); }
// public java.security.PublicKey decodeRsaPublicKeyPem(java.lang.String key) { return wrapperContained.decodeRsaPublicKeyPem(key); }
// public java.security.PrivateKey decodeEncodedRsaPrivateKey(byte key) { return wrapperContained.decodeEncodedRsaPrivateKey(key); }

}