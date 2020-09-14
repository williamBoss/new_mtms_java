package com.ruoyi.mtms.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruoyi.mtms.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
* ${TODO}
* @author KING
* @date 2020/9/14 20:25
* @version V1.0
*/
/**
    * sf36评估量表
    */
@ApiModel(value="com-ruoyi-mtms-domain-Sf36")
@Data
@EqualsAndHashCode(callSuper=true)
@TableName(value = "mtms_sf36")
public class Sf36 extends BaseEntity {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="id")
    private Integer id;

    /**
     * 评估id
     */
    @TableField(value = "assessment_id")
    @ApiModelProperty(value="评估id")
    private Integer assessmentId;

    /**
     * 患者主键
     */
    @TableField(value = "pat_id")
    @ApiModelProperty(value="患者主键")
    private Integer patId;

    /**
     * 1、总体来讲，您的健康状况是：
①非常好   ②很好     ③好     ④一般      ⑤差 

     */
    @TableField(value = "sf36_1")
    @ApiModelProperty(value="1、总体来讲，您的健康状况是：,①非常好   ②很好     ③好     ④一般      ⑤差 ,")
    private Integer sf361;

    /**
     * 2、跟1年以前比您觉得自己的健康状况是：
①比1年前好多了    ②比1年前好一些     ③跟1年前差不多     ④比1年前差一些    ⑤比1年前差多了

     */
    @TableField(value = "sf36_2")
    @ApiModelProperty(value="2、跟1年以前比您觉得自己的健康状况是：,①比1年前好多了    ②比1年前好一些     ③跟1年前差不多     ④比1年前差一些    ⑤比1年前差多了,")
    private Integer sf362;

    /**
     * 3.1（1）重体力活动。如跑步举重、参加剧烈运动等：
①限制很大   ②有些限制    ③毫无限制


     */
    @TableField(value = "sf36_3_1")
    @ApiModelProperty(value="3.1（1）重体力活动。如跑步举重、参加剧烈运动等：,①限制很大   ②有些限制    ③毫无限制,,")
    private Integer sf3631;

    /**
     * （2）适度的活动。如移动一张桌子、扫地、打太极拳、做简单体操等：
①限制很大   ②有些限制    ③毫无限制

     */
    @TableField(value = "sf36_3_2")
    @ApiModelProperty(value="（2）适度的活动。如移动一张桌子、扫地、打太极拳、做简单体操等：,①限制很大   ②有些限制    ③毫无限制,")
    private Integer sf3632;

    /**
     * （3）手提日用品。如买菜、购物等：
①限制很大   ②有些限制    ③毫无限制

     */
    @TableField(value = "sf36_3_3")
    @ApiModelProperty(value="（3）手提日用品。如买菜、购物等：,①限制很大   ②有些限制    ③毫无限制,")
    private Integer sf3633;

    /**
     * （4）上几层楼梯：
①限制很大   ②有些限制    ③毫无限制

     */
    @TableField(value = "sf36_3_4")
    @ApiModelProperty(value="（4）上几层楼梯：,①限制很大   ②有些限制    ③毫无限制,")
    private Integer sf3634;

    /**
     * （5）上一层楼梯：
①限制很大   ②有些限制    ③毫无限制

     */
    @TableField(value = "sf36_3_5")
    @ApiModelProperty(value="（5）上一层楼梯：,①限制很大   ②有些限制    ③毫无限制,")
    private Integer sf3635;

    /**
     * （6）弯腰、屈膝、下蹲：
①限制很大   ②有些限制    ③毫无限制

     */
    @TableField(value = "sf36_3_6")
    @ApiModelProperty(value="（6）弯腰、屈膝、下蹲：,①限制很大   ②有些限制    ③毫无限制,")
    private Integer sf3636;

    /**
     * （7）步行1500米以上的路程：
①限制很大   ②有些限制    ③毫无限制

     */
    @TableField(value = "sf36_3_7")
    @ApiModelProperty(value="（7）步行1500米以上的路程：,①限制很大   ②有些限制    ③毫无限制,")
    private Integer sf3637;

    /**
     * （8）步行1000米的路程：
①限制很大   ②有些限制    ③毫无限制

     */
    @TableField(value = "sf36_3_8")
    @ApiModelProperty(value="（8）步行1000米的路程：,①限制很大   ②有些限制    ③毫无限制,")
    private Integer sf3638;

    /**
     * （9）步行100米的路程：
①限制很大   ②有些限制    ③毫无限制

     */
    @TableField(value = "sf36_3_9")
    @ApiModelProperty(value="（9）步行100米的路程：,①限制很大   ②有些限制    ③毫无限制,")
    private Integer sf3639;

    /**
     * （10）自己洗澡、穿衣：
①限制很大   ②有些限制    ③毫无限制

     */
    @TableField(value = "sf36_3_10")
    @ApiModelProperty(value="（10）自己洗澡、穿衣：,①限制很大   ②有些限制    ③毫无限制,")
    private Integer sf36310;

    /**
     * 4.1（1）减少了工作或其他活动时间：
①是   ②不是

     */
    @TableField(value = "sf36_4_1")
    @ApiModelProperty(value="4.1（1）减少了工作或其他活动时间：,①是   ②不是,")
    private Integer sf3641;

    /**
     * （2）本来想要做的事情只能完成一部分：
①是   ②不是

     */
    @TableField(value = "sf36_4_2")
    @ApiModelProperty(value="（2）本来想要做的事情只能完成一部分：,①是   ②不是,")
    private Integer sf3642;

    /**
     * （3）想要干的工作或活动种类受到限制：
①是   ②不是

     */
    @TableField(value = "sf36_4_3")
    @ApiModelProperty(value="（3）想要干的工作或活动种类受到限制：,①是   ②不是,")
    private Integer sf3643;

    /**
     * （4）完成工作或其他活动困难增多（比如需要额外的努力）：
①是   ②不是 

     */
    @TableField(value = "sf36_4_4")
    @ApiModelProperty(value="（4）完成工作或其他活动困难增多（比如需要额外的努力）：,①是   ②不是 ,")
    private Integer sf3644;

    /**
     * 5.1（1）减少了工作或活动时间：
①是   ②不是

     */
    @TableField(value = "sf36_5_1")
    @ApiModelProperty(value="5.1（1）减少了工作或活动时间：,①是   ②不是,")
    private Integer sf3651;

    /**
     * （2）本来想要做的事情只能完成一部分：
①是   ②不是

     */
    @TableField(value = "sf36_5_2")
    @ApiModelProperty(value="（2）本来想要做的事情只能完成一部分：,①是   ②不是,")
    private Integer sf3652;

    /**
     * （3）干事情不如平时仔细：
①是   ②不是

     */
    @TableField(value = "sf36_5_3")
    @ApiModelProperty(value="（3）干事情不如平时仔细：,①是   ②不是,")
    private Integer sf3653;

    /**
     * 6、在过去4个星期里，您的健康或情绪不好在多大程度上影响了您与家人、朋友、邻居或集体的正常社会交往？
①完全没有影响   ②有一点影响   ③中等影响   ④影响很大   ⑤影响非常大

     */
    @TableField(value = "sf36_6")
    @ApiModelProperty(value="6、在过去4个星期里，您的健康或情绪不好在多大程度上影响了您与家人、朋友、邻居或集体的正常社会交往？,①完全没有影响   ②有一点影响   ③中等影响   ④影响很大   ⑤影响非常大,")
    private Integer sf366;

    /**
     * 7、在过去4个星期里，您有身体疼痛吗？
①完全没有疼痛   ②有一点疼痛   ③中等疼痛   ④严重疼痛   ⑤很严重疼痛

     */
    @TableField(value = "sf36_7")
    @ApiModelProperty(value="7、在过去4个星期里，您有身体疼痛吗？,①完全没有疼痛   ②有一点疼痛   ③中等疼痛   ④严重疼痛   ⑤很严重疼痛,")
    private Integer sf367;

    /**
     * 8、在过去4个星期里，您的身体疼痛影响了您的工作和家务吗？
①完全没有影响   ②有一点影响   ③中等影响   ④影响很大   ⑤影响非常大

     */
    @TableField(value = "sf36_8")
    @ApiModelProperty(value="8、在过去4个星期里，您的身体疼痛影响了您的工作和家务吗？,①完全没有影响   ②有一点影响   ③中等影响   ④影响很大   ⑤影响非常大,")
    private Integer sf368;

    /**
     * 9.1（1）您觉得生活充实：
①所有的时间     ②大部分时间     ③比较多时间     ④一部分时间     ⑤小部分时间   ⑥没有这种感觉

     */
    @TableField(value = "sf36_9_1")
    @ApiModelProperty(value="9.1（1）您觉得生活充实：,①所有的时间     ②大部分时间     ③比较多时间     ④一部分时间     ⑤小部分时间   ⑥没有这种感觉,")
    private Integer sf3691;

    /**
     * （2）您是一个敏感的人：
①所有的时间     ②大部分时间     ③比较多时间     ④一部分时间     ⑤小部分时间   ⑥没有这种感觉

     */
    @TableField(value = "sf36_9_2")
    @ApiModelProperty(value="（2）您是一个敏感的人：,①所有的时间     ②大部分时间     ③比较多时间     ④一部分时间     ⑤小部分时间   ⑥没有这种感觉,")
    private Integer sf3692;

    /**
     * （3）您的情绪非常不好，什么事都不能使您高兴起来：
①所有的时间     ②大部分时间     ③比较多时间     ④一部分时间     ⑤小部分时间   ⑥没有这种感觉

     */
    @TableField(value = "sf36_9_3")
    @ApiModelProperty(value="（3）您的情绪非常不好，什么事都不能使您高兴起来：,①所有的时间     ②大部分时间     ③比较多时间     ④一部分时间     ⑤小部分时间   ⑥没有这种感觉,")
    private Integer sf3693;

    /**
     * （4）您的心理很平静：
①所有的时间     ②大部分时间     ③比较多时间     ④一部分时间     ⑤小部分时间   ⑥没有这种感觉

     */
    @TableField(value = "sf36_9_4")
    @ApiModelProperty(value="（4）您的心理很平静：,①所有的时间     ②大部分时间     ③比较多时间     ④一部分时间     ⑤小部分时间   ⑥没有这种感觉,")
    private Integer sf3694;

    /**
     * （5）您做事精力充沛：
①所有的时间     ②大部分时间     ③比较多时间     ④一部分时间     ⑤小部分时间   ⑥没有这种感觉

     */
    @TableField(value = "sf36_9_5")
    @ApiModelProperty(value="（5）您做事精力充沛：,①所有的时间     ②大部分时间     ③比较多时间     ④一部分时间     ⑤小部分时间   ⑥没有这种感觉,")
    private Integer sf3695;

    /**
     * （6）您的情绪低落：
①所有的时间     ②大部分时间     ③比较多时间     ④一部分时间     ⑤小部分时间   ⑥没有这种感觉

     */
    @TableField(value = "sf36_9_6")
    @ApiModelProperty(value="（6）您的情绪低落：,①所有的时间     ②大部分时间     ③比较多时间     ④一部分时间     ⑤小部分时间   ⑥没有这种感觉,")
    private Integer sf3696;

    /**
     * （7）您觉得筋疲力尽：
①所有的时间     ②大部分时间     ③比较多时间     ④一部分时间     ⑤小部分时间   ⑥没有这种感觉

     */
    @TableField(value = "sf36_9_7")
    @ApiModelProperty(value="（7）您觉得筋疲力尽：,①所有的时间     ②大部分时间     ③比较多时间     ④一部分时间     ⑤小部分时间   ⑥没有这种感觉,")
    private Integer sf3697;

    /**
     * （8）您是个快乐的人：
①所有的时间     ②大部分时间     ③比较多时间     ④一部分时间     ⑤小部分时间   ⑥没有这种感觉

     */
    @TableField(value = "sf36_9_8")
    @ApiModelProperty(value="（8）您是个快乐的人：,①所有的时间     ②大部分时间     ③比较多时间     ④一部分时间     ⑤小部分时间   ⑥没有这种感觉,")
    private Integer sf3698;

    /**
     * （9）您感觉厌烦：
①所有的时间     ②大部分时间     ③比较多时间     ④一部分时间     ⑤小部分时间   ⑥没有这种感觉

     */
    @TableField(value = "sf36_9_9")
    @ApiModelProperty(value="（9）您感觉厌烦：,①所有的时间     ②大部分时间     ③比较多时间     ④一部分时间     ⑤小部分时间   ⑥没有这种感觉,")
    private Integer sf3699;

    /**
     * 10）不健康影响了您的社会活动（如走亲访友）：
①所有的时间     ②大部分时间     ③比较多时间     ④一部分时间     ⑤小部分时间   ⑥没有这种感觉

     */
    @TableField(value = "sf36_9_10")
    @ApiModelProperty(value="10）不健康影响了您的社会活动（如走亲访友）：,①所有的时间     ②大部分时间     ③比较多时间     ④一部分时间     ⑤小部分时间   ⑥没有这种感觉,")
    private Integer sf36910;

    /**
     * 10.1（1）我好象比别人容易生病：
①绝对正确    ②大部分正确   ③不能肯定   ④大部分错误  ⑤绝对错误`

     */
    @TableField(value = "sf36_10_1")
    @ApiModelProperty(value="10.1（1）我好象比别人容易生病：,①绝对正确    ②大部分正确   ③不能肯定   ④大部分错误  ⑤绝对错误`,")
    private Integer sf36101;

    /**
     * （2）我跟周围人一样健康：
①绝对正确    ②大部分正确   ③不能肯定   ④大部分错误  ⑤绝对错误

     */
    @TableField(value = "sf36_10_2")
    @ApiModelProperty(value="（2）我跟周围人一样健康：,①绝对正确    ②大部分正确   ③不能肯定   ④大部分错误  ⑤绝对错误,")
    private Integer sf36102;

    /**
     * （3）我认为我的健康状况在变坏：
①绝对正确    ②大部分正确   ③不能肯定   ④大部分错误  ⑤绝对错误

     */
    @TableField(value = "sf36_10_3")
    @ApiModelProperty(value="（3）我认为我的健康状况在变坏：,①绝对正确    ②大部分正确   ③不能肯定   ④大部分错误  ⑤绝对错误,")
    private Integer sf36103;

    /**
     * （4）我的健康状况非常好：
①绝对正确    ②大部分正确   ③不能肯定   ④大部分错误  ⑤绝对错误

     */
    @TableField(value = "sf36_10_4")
    @ApiModelProperty(value="（4）我的健康状况非常好：,①绝对正确    ②大部分正确   ③不能肯定   ④大部分错误  ⑤绝对错误,")
    private Integer sf36104;

    @TableField(value = "create_user")
    @ApiModelProperty(value="")
    private Integer createUser;

    @TableField(value = "update_user")
    @ApiModelProperty(value="")
    private Integer updateUser;
}