package Scaler.Assignment27022023;

public class MaximumProfit1 {
    public static void main(String[] args) {
        int []A={4194445, 5755801, 2855639, 4681951, 642183, 9606207, 6539770, 2929563, 2371075, 2065991, 4734767, 3035028, 9844237, 9859030, 5366228, 7126800, 3093826, 2064333, 4794134, 6009455, 1554282, 1141024, 9008908, 5564577, 5670584, 3701388, 305389, 9988838, 7607445, 8689404, 4606240, 721493, 8358372, 7969247, 2005188, 9381407, 9640526, 1257732, 3128856, 5674956, 7212588, 5699639, 3391536, 9223297, 303612, 246025, 4664705, 5533721, 1254106, 6723049, 7092956, 9115027, 4029515, 8682821, 3075505, 2455402, 8685967, 7823073, 8138079, 5223844, 7204268, 8388370, 4932424, 1163737, 5251626, 5026560, 5050075, 444693, 8416089, 6533127, 8849938, 9195466, 6912747, 318446, 2255659, 1324379, 1091239, 7558075, 9314612, 7170906, 3222755, 3626629, 184898, 4602309, 1596067, 2979905, 5350257, 2919884, 9904801, 722970, 8136001, 1391045, 6414844, 2205953, 4755182, 2798289, 5134693, 9826047, 432014, 6805799, 6827969, 7032606, 4696237, 5731657, 2733376, 4768391, 2782129, 4632527, 4485247, 9064703, 3372660, 9420437, 4193640, 2612882, 2867493, 8068152, 3907859, 124864, 5942858, 5168681, 5242568, 474474, 8675032, 1368145, 5358739, 4107643, 1657155, 9175880, 8535311, 8277280, 7462655, 5984330, 7676367, 498783, 9495820, 3076391, 3546466, 3806366, 1312460, 652185, 9729605, 2472157, 913603, 78321, 7611113, 6599149, 4055264, 8831043, 2431665, 6773353, 262124, 8150637, 3198010, 9990139, 811941, 7829764, 5725450, 223476, 4615776, 9894103, 5906398, 906269, 3967342, 1543460, 4301996, 1787414, 8254232, 1789655, 4230800, 5969792, 905489, 3258010, 9454136, 4249389, 6467504, 6519664, 4001349, 5026632, 5014202, 6667981, 3817855, 5034444, 6930070, 1349637, 1035425, 9252606, 6607642, 2524617, 1006652, 3528601, 2690079, 9721966, 4199938, 5762348, 128435, 4118901, 6892353, 2989545, 666501, 5888056, 8654317, 4248490, 762635, 5111086, 5764247, 1866872, 4293692, 9257206, 6891118, 6087668, 941907, 8810109, 6646582, 3630739, 446420, 351840, 4011717, 3143139, 7749114, 6392659, 9048202, 7016084, 2382421, 4446109, 8485561, 5782000, 3949229, 5221723, 8561121, 9303285, 1543066, 6108565, 2722519, 7758442, 6163843, 2755475, 1023498, 5443927, 312752, 9196009, 3221496, 2914945, 2653161, 4489388, 1959263, 5623432, 9971827, 3785009, 7319090, 7630374, 5217607, 8044924, 8769872, 8185537, 1597610, 7814177, 1029537, 7567770, 2258460, 5576548, 482655, 2612813, 3224455, 2585241, 1092094, 9877649, 7498080, 5699558, 2951043, 6086409, 9542232, 661452, 5836164, 4345098, 8307895, 6637498, 6272548, 6046123, 3646645, 774039, 2892326, 8990224, 7423970, 1974660, 2915143, 3225108, 7089874, 6573037, 562334, 4269980, 489996, 1186345, 8226531, 816581, 768322, 8850738, 4660865, 816794, 6128349, 9412437, 8816780, 8379353, 3537553, 4864852, 5573468, 79518, 6575334, 7596536, 6889113, 9602795, 6640332, 2332107, 6535110, 7488014, 9995147, 3170250, 5091560, 1360125, 7509497, 1121503, 7358828, 4794661, 7027205, 3332651, 9573810, 4093855, 7576965, 2998873, 7914729, 1092664, 1802541, 8724368, 558214, 2857902, 2716188, 2003935, 7168482, 6012254, 3643378, 6074238, 6647950, 6389831, 5109285, 866253, 381182, 1164871, 6275734, 1373355, 7017631, 5325732, 255703, 8151488, 9133852, 5909110, 3275900, 6061125, 475435, 3611189, 2999139, 4638073, 8973840, 2561265, 3769187, 6653732, 8312926, 8824383, 1472759, 4821429, 1483913, 862658, 5331434, 5223163, 9257756, 1027441, 4445934, 8306958, 9852026, 203971, 5610515, 9554829, 2882366, 5159575, 5463819, 2912256, 1762629, 2822314, 1863502, 3884780, 3574742, 8568504, 1253111, 503241, 6109333, 7496262, 7489733, 4319399, 9349740, 3945259, 8884655, 7607110, 8608523, 4386536, 9292660, 9617100, 5400748, 5880352, 8878708, 4242669, 7471856, 7150688, 9502486, 3485539, 2421557, 1965130, 7403648, 8796538, 6717060, 259999, 6321534, 2791184, 4094667, 4931963, 1782625, 497135, 931841, 7789116, 9062312, 1314376, 4186203, 2781984, 6351555, 6433207, 5584677, 6332921, 1563685, 1553136, 2297922, 8427601, 1826430, 3253257, 1884767, 5263589, 7242437, 4136563, 2669239, 4890360, 7994097, 3243588, 3024004, 6227582, 4667341, 5951200, 7625344, 5601489, 525262, 9273359, 6532814, 5958471, 4875336, 1980311, 2047533, 1693741, 5059206, 1441267, 8561945, 9413927, 267932, 9767893, 5708235, 8490874, 5875232, 4514791, 122809, 8169308, 5485225, 1258832, 6423197, 7401453, 63428, 6242952, 3935999, 5627757, 7677399, 7549112, 7071403, 1269499, 6408877, 4263892, 2386645, 2142089, 9680907, 8958646, 787007, 7100373, 3563871, 9002573, 369222, 2707131, 9279796, 2847105, 7396262, 8662258, 2403065, 8174614, 5792694, 6292058, 3741998, 2806982, 9193909, 4390354, 5450971, 9800176, 9442318, 848643, 3667121, 6013064, 7078994, 864441, 2124755, 987795, 3904413, 4436411, 3207605, 4372015, 400985, 3196209, 8094432, 1053017, 710448, 349168, 6789123, 7444730, 3441905, 3933247, 6882550, 6867729, 9164628, 165786, 716556, 1109737, 3671507, 6671443, 1236642, 1664765, 9329820, 5442137, 6931445, 3808660, 2034565, 8492007, 1031792, 2348823, 7364453, 4999931, 4322960, 8340199, 639089, 135093, 4657084, 8368461, 8517539, 6231696, 8261869, 8247731, 7867767, 7266041, 6158750, 7335486, 8035170, 4269642, 7393800, 7019543, 4434206, 3330723, 6580929, 4449142, 8067766, 3682033, 3698348, 3067274, 9752295, 1121939, 7713186, 1157402, 2462787, 8355113, 3140410, 3159795, 1928352, 5335266, 5919865, 505504, 2750149, 2786405, 2165156, 7275716, 2443565, 7820731, 3257234, 3943777, 3295474, 173055, 6809788, 6093159, 264240, 3204306, 9165393, 6552803, 8654172, 2492684, 2467027, 126724, 6043336, 3988090, 1145326, 9919194, 4786559, 1544896, 9566382, 6783344, 9457825, 8712145, 5598821, 2627075, 7848949, 4073282, 5164981, 5966346, 4412603, 7695179, 9612711, 3863295, 6957529, 7419982, 7950638, 9746913, 8971977, 6977344, 7509979};
        int min=Integer.MAX_VALUE;
        int lastestMinIndex=-1;
        if(A.length==1 || A.length==0)
            System.out.println(0);
        for(int i=0;i<A.length;i++) {
            if (A[i] < min) {
                min = A[i];
                lastestMinIndex=i;
            }
        }
        int max=A[lastestMinIndex];
        for(int i=lastestMinIndex+1;i<A.length;i++){
            if(A[i]>max){
                max=A[i];
            }
        }
        System.out.println(max-min);

    }
}
