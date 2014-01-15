//
// A sample program of Message Disgest
//

import java.security.MessageDigest

def hexBytes(bs: Array[Byte]):String =
  bs.map("%02X".format(_)).mkString(" ")
  
val md2 = MessageDigest.getInstance("MD2")
val md5 = MessageDigest.getInstance("MD5")
val sha1 = MessageDigest.getInstance("SHA-1")
val sha256 = MessageDigest.getInstance("SHA-256")
val sha384 = MessageDigest.getInstance("SHA-384")
val sha512 = MessageDigest.getInstance("SHA-512")

val bytes = "plain text".getBytes

md2.update(bytes)
md5.update(bytes)
sha1.update(bytes)
sha256.update(bytes)
sha384.update(bytes)
sha512.update(bytes)

printf("MD2:     %s%n", hexBytes(md2.digest))
printf("MD5:     %s%n", hexBytes(md5.digest))
printf("SHA-1:   %s%n", hexBytes(sha1.digest))
printf("SHA-256: %s%n", hexBytes(sha256.digest))
printf("SHA-384: %s%n", hexBytes(sha384.digest))
printf("SHA-512: %s%n", hexBytes(sha512.digest))
