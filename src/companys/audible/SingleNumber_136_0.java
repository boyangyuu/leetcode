package companys.audible;

/**
 * Created by yuboyang on 7/15/17.
 */
/*
http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=208592


刚挂电话，妈的。。真是给跪了。。lz电话信号今天突然很差。。他问了我一个behaviour, 我说了很多。。结果他直接掉了。。我整个人都不好了。。。。题目很简单，就是single number,然后我跟他说了两个，一个xor，一个hashset或者hashmap,然后我犯蠢了，写code之前没问清楚input array type, 就直接assume 了int array, 然后用了xor,然后他说，那如果是1，2，1，2，3.5呢，楼主顿时萌比，tmd 一个array里面的type还能不一样，咋有double又有int，一下子有点方，我就试着跟他说那就用HashMap<Object, Integer>, 然后重写hashcode, equal? 他也蒙蔽了。。说。。为啥你要这么做。。我说，那就Double把。。。他说： 嗯，这个可以。。我这才懂了type变成double了，然后我就把hashmap的方法又写了一遍，。。他说OK，只不过最后返回的时候，要返回那个single number的时候，如果没有，就返回-1，当时lz太年轻没想到-1。。写了个Double.MIN_VALUE; 他看了一下，说OK，但是你最后返回的是个啥，我说，找不到就返回这个，小哥说，，嘿嘿。。-1就行了。。因为double.MIN_VALUE有blabla问题。,我说我错了我错了。。然后改成了-1，然后他问我，好了，你有啥问题问我，我心想卧槽。。就这个题？是不是我前面没交流好。。。但是我又不敢问。。我就问了他三个问题。。小哥感觉挺感兴趣。。跟我说了很久，我就一直cool了下去。。到最后也没出第二题。。。


LZ现在很方。。是不是前面表现太差他觉得第二道题没必要了。。。wocao...真不怪我啊。。信号太差，他掉了。。。 大家跟着分析分析？安慰一下LZ...感觉很蓝受。。。


补充内容 (2016-11-2 04:12):
对了，还请大家给点儿意见，关于我上面的描述，你们觉得我哪里还有工作需要做，例如：面试沟通，害怕提问这些的。。求意见啊。。

补充内容 (2016-11-3 03:46):
内推人告诉我feedback很不好,说我只用了hashmap的方法？exo me??我的哥。。然后说交流不行。。估计就是信号差,我fnmdx,FactSet都没说我交流不好给了onsite...哎.不说了..另外,我才知道pool是共享,Amazon也完犊子了。

 */

public class SingleNumber_136_0 {
}
