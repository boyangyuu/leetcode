package systemDesign.c2_user;

/**
 * Created by yuboyang on 7/27/17.
 *
 *
 */
/*
Implement a memcache which support the following features:

get(curtTime, key). Get the key's value, return 2147483647 if key does not exist.
set(curtTime, key, value, ttl). Set the key-value pair in memcache with a time to live (ttl). The key will be valid from curtTime to curtTime + ttl - 1 and it will be expired after ttl seconds. if ttl is 0, the key lives forever until out of memory.
delete(curtTime, key). Delete the key.
incr(curtTime, key, delta). Increase the key's value by delta return the new value. Return 2147483647 if key does not exist.
decr(curtTime, key, delta). Decrease the key's value by delta return the new value. Return 2147483647 if key does not exist.
It's guaranteed that the input is given with increasingcurtTime.

 */
public class Memcache {
    /*
    1. set(key, value, ttl)
    2. meme.delete(key), db.delete(user);
    3. if (mem.contains) return mem.get(); else db.get(), mem.set
    4. cache 常用于 读> 写,
    5.
     */


}
