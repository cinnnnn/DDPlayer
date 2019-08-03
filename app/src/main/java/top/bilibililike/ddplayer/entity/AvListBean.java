package top.bilibililike.ddplayer.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AvListBean  {


    /**
     * code : 0
     * message : 0
     * ttl : 1
     * data : {"items":[{"card_type":"banner_v2","card_goto":"banner","args":{},"idx":1564654716,"hash":"14536727619836272591","banner_item":[{"id":332204,"title":"局座 浅澄月终于面基了~","image":"http://i0.hdslb.com/bfs/archive/ca8b8b1dabf00e7c92072bc7da68302cbf84b888.jpg","hash":"5b61501892aee8e20467b71a58f2f0ef","uri":"https://www.bilibili.com/video/av61422525/","request_id":"1564654717451q172a22a48a149q14459","src_id":702,"is_ad_loc":true,"client_ip":"36.157.178.181","server_type":0,"resource_id":631,"index":1,"cm_mark":0},{"id":0,"title":"","image":"https://i0.hdslb.com/bfs/sycp/creative_img/201907/6661b7498c233b33c3bea90a0e87a21d.jpg","hash":"9be612cfba0399e39714065e98b61223","uri":"https://game.bilibili.com/indiegame/fb-h5","request_id":"1564654717451q172a22a48a149q14459","creative_id":259392610263814144,"src_id":703,"is_ad":true,"is_ad_loc":true,"ad_cb":"CAAQABiAoIvBxobjzAMgACgAMCQ4vwVCITE1NjQ2NTQ3MTc0NTFxMTcyYTIyYTQ4YTE0OXExNDQ1OUiLlMHlxC1SBuWohOW6lVoG5rmW5Y2XYgbkuK3lm71oAXAAeICAgIAQgAEAiAHvQJIBDjM2LjE1Ny4xNzguMTgxmgG5BGFsbDpjcGNfY3Jvd2RfdGFyZ2V0LGVjcG06ZGVmYXVsdCxjcGNUYWdGaWx0ZXI6dW5kZWZpbmVkLGVuaGFuY2VDdHJRRmFjdG9yOnNxdWFyZSxwbGF5cGFnZWN0cjplbmFibGVfY29uc3RhbnQsdXBfcmVjX2Zsb3dfY29udHJvbDp1bmRlZmluZWQsYnJ1c2hfZHVwbGljYXRlOmRlZmF1bHQscGN0cl9jcG06Y3BtLHBjdHJfdjI6bHJfY29uc3RhbnQsZHluYW1pY19mbG93X2NvbnRyb2w6c3BsaXQgdGhlIGZsb3cgYnkgbWlkLHBjdnI6ZGxkLGZyZXFMaW1pdDpkZWZhdWx0LHNtYWxsQ29uc3VtZVVuaXQ6ZGVmYXVsdCxvdXRlckJlYXRJbm5lcjpkZWZhdWx0LG91dGVyUXVpdDpkZWZhdWx0LGZkc19ydHQ6OCxjcGE6Y3BhXzMwZCxpbmRpc19VVjp1bmRlZmluZWQsaGFzaF9pbmRpc19VVjp1bmRlZmluZWQsZmVlZHNfcmFuZG9tX3Jlc3VsdDpkZWZhdWx0LGZsb3dfcmF0aW9fY2hlY2s6cjMsYmFzZV9oYXNoX2luZGlzX1VWOnVuZGVmaW5lZCxjdHJfdHJ1bmNhdGlvbl9leHA6dHJ1bmNhdGlvbl8xNTAsZG1wX2FnZV9leHA6dW5kZWZpbmVkLGNvbGRfYm9vdF9leHA6ZGVmYXVsdCxwbGF0Zm9ybTpkZWZhdWx0oAEAqAEAsgEgsKUaYcX+XTV3eWZWWHv6caz4hEzSXGMbD0D2hG1jnrK6ASlodHRwczovL2dhbWUuYmlsaWJpbGkuY29tL2luZGllZ2FtZS9mYi1oNcIBANIBANgBAeABAOgBAPABAPgBAIACAIgCALgCAMACAMgCANACANgCAOoCAPACie0D+ALmAagDAA==","client_ip":"36.157.178.181","server_type":1,"resource_id":631,"index":2,"cm_mark":1,"extra":{"use_ad_web_v2":false,"show_urls":[],"click_urls":[],"download_whitelist":[],"open_whitelist":[],"card":{"card_type":0,"title":"","covers":[{"url":"https://i0.hdslb.com/bfs/sycp/creative_img/201907/6661b7498c233b33c3bea90a0e87a21d.jpg","loop":0}],"jump_url":"https://game.bilibili.com/indiegame/fb-h5","desc":"","callup_url":"","long_desc":"","ad_tag":"","extra_desc":"","ad_tag_style":{"type":2,"text":"广告","text_color":"#999999FF","bg_border_color":"#999999FF"},"feedback_panel":{"panel_type_text":"广告","feedback_panel_detail":[]}},"report_time":2000,"sales_type":31,"special_industry":false,"special_industry_tips":"","preload_landingpage":0,"share_info":{}}},{"id":0,"title":"","image":"https://i0.hdslb.com/bfs/sycp/creative_img/201907/3d6d43833a59b44b7ed1fade8420412e.jpg","hash":"4b7010ed8ca4750a31a068cb2ae0d621","uri":"bilibili://game_center/detail?id=102057&sourceFrom=782&sourceType=adPut","request_id":"1564654717451q172a22a48a149q14459","creative_id":259379263577444352,"src_id":704,"is_ad":true,"is_ad_loc":true,"ad_cb":"CAAQABiAoIudjoLgzAMgACgAMCQ4wAVCITE1NjQ2NTQ3MTc0NTFxMTcyYTIyYTQ4YTE0OXExNDQ1OUiLlMHlxC1SBuWohOW6lVoG5rmW5Y2XYgbkuK3lm71oAXAAeICAgIAQgAEAiAHyQJIBDjM2LjE1Ny4xNzguMTgxmgG5BGFsbDpjcGNfY3Jvd2RfdGFyZ2V0LGVjcG06ZGVmYXVsdCxjcGNUYWdGaWx0ZXI6dW5kZWZpbmVkLGVuaGFuY2VDdHJRRmFjdG9yOnNxdWFyZSxwbGF5cGFnZWN0cjplbmFibGVfY29uc3RhbnQsdXBfcmVjX2Zsb3dfY29udHJvbDp1bmRlZmluZWQsYnJ1c2hfZHVwbGljYXRlOmRlZmF1bHQscGN0cl9jcG06Y3BtLHBjdHJfdjI6bHJfY29uc3RhbnQsZHluYW1pY19mbG93X2NvbnRyb2w6c3BsaXQgdGhlIGZsb3cgYnkgbWlkLHBjdnI6ZGxkLGZyZXFMaW1pdDpkZWZhdWx0LHNtYWxsQ29uc3VtZVVuaXQ6ZGVmYXVsdCxvdXRlckJlYXRJbm5lcjpkZWZhdWx0LG91dGVyUXVpdDpkZWZhdWx0LGZkc19ydHQ6OCxjcGE6Y3BhXzMwZCxpbmRpc19VVjp1bmRlZmluZWQsaGFzaF9pbmRpc19VVjp1bmRlZmluZWQsZmVlZHNfcmFuZG9tX3Jlc3VsdDpkZWZhdWx0LGZsb3dfcmF0aW9fY2hlY2s6cjMsYmFzZV9oYXNoX2luZGlzX1VWOnVuZGVmaW5lZCxjdHJfdHJ1bmNhdGlvbl9leHA6dHJ1bmNhdGlvbl8xNTAsZG1wX2FnZV9leHA6dW5kZWZpbmVkLGNvbGRfYm9vdF9leHA6ZGVmYXVsdCxwbGF0Zm9ybTpkZWZhdWx0oAEAqAEAsgEgOH58cHYj+YY7oRcqen/JaskRYtS52etTy0E6n5U3tqy6AUdiaWxpYmlsaTovL2dhbWVfY2VudGVyL2RldGFpbD9pZD0xMDIwNTcmc291cmNlRnJvbT03ODImc291cmNlVHlwZT1hZFB1dMIBANIBANgBAeABAOgBAPABAPgBAIACAIgCALgCAMACAMgCANACANgCAOoCAPACve0D+ALmAagDAA==","click_url":"https://ad-bili-data.biligame.com/api/mobile/clickBili?ad_plan_id=36594&mid=__MID__&os=0&idfa=__IDFA__&buvid=__BUVID__&android_id=__ANDROIDID__&imei=__IMEI__&mac=__MAC__&duid=__DUID__&ip=36.157.178.181&request_id=1564654717451q172a22a48a149q14459&ts=__TS__&ua=__UA__","client_ip":"36.157.178.181","server_type":1,"resource_id":631,"index":3,"cm_mark":1,"extra":{"use_ad_web_v2":false,"show_urls":[],"click_urls":["https://ad-bili-data.biligame.com/api/mobile/clickBili?ad_plan_id=36594&mid=__MID__&os=0&idfa=__IDFA__&buvid=__BUVID__&android_id=__ANDROIDID__&imei=__IMEI__&mac=__MAC__&duid=__DUID__&ip=36.157.178.181&request_id=1564654717451q172a22a48a149q14459&ts=__TS__&ua=__UA__"],"download_whitelist":[],"open_whitelist":[],"card":{"card_type":0,"title":"","covers":[{"url":"https://i0.hdslb.com/bfs/sycp/creative_img/201907/3d6d43833a59b44b7ed1fade8420412e.jpg","loop":0}],"jump_url":"bilibili://game_center/detail?id=102057&sourceFrom=782&sourceType=adPut","desc":"","callup_url":"","long_desc":"","ad_tag":"","extra_desc":"","ad_tag_style":{"type":2,"text":"广告","text_color":"#999999FF","bg_border_color":"#999999FF"},"feedback_panel":{"panel_type_text":"广告","feedback_panel_detail":[]}},"report_time":2000,"sales_type":31,"special_industry":false,"special_industry_tips":"","preload_landingpage":0,"share_info":{}}},{"id":332363,"title":"李宇春音乐创作历程大公开","image":"http://i0.hdslb.com/bfs/archive/217f10fefc72a7132bce70c2d5967a08e1807262.png","hash":"0d544791be7a546be671773b1a3f0fb1","uri":"https://www.bilibili.com/blackboard/topic/activity-fmRYzMG7U.html","request_id":"1564654717451q172a22a48a149q14459","src_id":705,"is_ad_loc":true,"client_ip":"36.157.178.181","server_type":0,"resource_id":631,"index":4,"cm_mark":0},{"id":332354,"title":"乘着浪潮前进","image":"http://i0.hdslb.com/bfs/archive/214e7483f3c962cb6f598a72764714a993947f76.jpg","hash":"89c8d6fed96c95e64cdc080e15ef885b","uri":"https://www.bilibili.com/read/cv3117784","request_id":"1564654717451q172a22a48a149q14459","src_id":1654,"is_ad_loc":true,"client_ip":"36.157.178.181","server_type":0,"resource_id":631,"index":5,"cm_mark":0}]},{"card_type":"small_cover_v2","card_goto":"live","goto":"live","param":"15081","cover":"http://i0.hdslb.com/bfs/live/f0971acb01e533e941fd2c739c6f637a1862b035.jpg","title":"【CSGO】白给狐狸","uri":"https://live.bilibili.com/15081?broadcast_type=0","three_point":{"dislike_reasons":[{"id":4,"name":"UP主:唧唧歪歪丶萌"},{"id":2,"name":"分区:CS:GO"},{"id":1,"name":"不感兴趣"}]},"args":{"up_id":238588,"up_name":"唧唧歪歪丶萌","rid":2,"rname":"网游","tid":89,"tname":"CS:GO"},"player_args":{"is_live":1,"room_id":15081,"type":"live"},"idx":1564655647,"three_point_v2":[{"title":"不感兴趣","subtitle":"(选择后将减少相似内容推荐)","reasons":[{"id":4,"name":"UP主:唧唧歪歪丶萌"},{"id":2,"name":"分区:CS:GO"},{"id":1,"name":"不感兴趣"}],"type":"dislike"}],"cover_left_text_1":"443","cover_left_icon_1":2,"cover_right_text":"唧唧歪歪丶萌","badge":"直播","rcmd_reason":"已关注","official_icon":16,"can_play":1,"rcmd_reason_style":{"text":"已关注","text_color":"#FFFFFFFF","bg_color":"#FFFB9E60","border_color":"#FFFB9E60","bg_style":1}},{"card_type":"small_cover_v2","card_goto":"av","goto":"av","param":"61662230","cover":"http://i2.hdslb.com/bfs/archive/d672f1cb72f122b96fb336407e836dacaea227c9.jpg","title":"明日方舟 三人H5-4  甲之蜜糖 乙之砒霜","uri":"bilibili://video/61662230?page=1&player_preload=%7B%22expire_time%22%3A1564658317%2C%22cid%22%3A107238898%2C%22support_quality%22%3A%5B116%2C74%2C80%2C64%2C32%2C16%5D%2C%22support_formats%22%3A%5B%22flv_p60%22%2C%22flv720_p60%22%2C%22flv%22%2C%22flv720%22%2C%22flv480%22%2C%22flv360%22%5D%2C%22support_description%22%3A%5B%22%E9%AB%98%E6%B8%85%201080P60%22%2C%22%E9%AB%98%E6%B8%85%20720P60%22%2C%22%E9%AB%98%E6%B8%85%201080P%22%2C%22%E9%AB%98%E6%B8%85%20720P%22%2C%22%E6%B8%85%E6%99%B0%20480P%22%2C%22%E6%B5%81%E7%95%85%20360P%22%5D%2C%22quality%22%3A32%2C%22url%22%3A%22http%3A%2F%2Fupos-hz-mirrorcosu.acgvideo.com%2Fupgcxcode%2F98%2F88%2F107238898%2F107238898-1-32.flv%3Fe%3Dig8euxZM2rNcNbNB7Wua7EMg7WUa7zTEto8g5X10ugNcXBlqNCNEto8g5gNvNE3DN0B5tZlqNxTEto8BTrNvN05fqx6S5ahE9IMvXBvE2ENvNCImNEVEK9GVqJIwqa80WXIekXRE9IB5QK%3D%3D%5Cu0026trid%3D3158ddf60f6b4c4a8a74705903b717b0%5Cu0026oi%3D614314677%5Cu0026platform%3Dandroid%5Cu0026gen%3Dplayurlbatch%5Cu0026uipk%3D5%5Cu0026os%3Dcosu%5Cu0026nbs%3D1%5Cu0026deadline%3D1564661917%5Cu0026upsig%3D45208311fc9ad43779e5504b7cb49f65%5Cu0026uparams%3De%2Ctrid%2Coi%2Cplatform%2Cgen%2Cuipk%2Cos%2Cnbs%2Cdeadline%22%2C%22file_info%22%3A%7B%22116%22%3A%7B%22infos%22%3A%5B%7B%22filesize%22%3A285890454%2C%22timelength%22%3A370674%7D%5D%7D%2C%2216%22%3A%7B%22infos%22%3A%5B%7B%22filesize%22%3A21598003%2C%22timelength%22%3A370708%7D%5D%7D%2C%2232%22%3A%7B%22infos%22%3A%5B%7B%22filesize%22%3A55775440%2C%22timelength%22%3A370708%7D%5D%7D%2C%2264%22%3A%7B%22infos%22%3A%5B%7B%22filesize%22%3A105295347%2C%22timelength%22%3A370708%7D%5D%7D%2C%2274%22%3A%7B%22infos%22%3A%5B%7B%22filesize%22%3A150548725%2C%22timelength%22%3A370674%7D%5D%7D%2C%2280%22%3A%7B%22infos%22%3A%5B%7B%22filesize%22%3A150324492%2C%22timelength%22%3A370708%7D%5D%7D%7D%2C%22video_codecid%22%3A7%2C%22video_project%22%3Atrue%2C%22fnver%22%3A0%2C%22fnval%22%3A0%7D&player_width=1456&player_height=816&player_rotate=0&trackid=all_16.shylf-ai-recsys-313.1564654717459.26","three_point":{"dislike_reasons":[{"id":4,"name":"UP主:柠 萌"},{"id":2,"name":"分区:手机游戏"},{"id":3,"name":"频道:攻略"},{"id":1,"name":"不感兴趣"}],"feedbacks":[{"id":1,"name":"恐怖血腥"},{"id":2,"name":"色情低俗"},{"id":3,"name":"封面恶心"},{"id":4,"name":"标题党/封面党"}],"watch_later":1},"args":{"up_id":632167,"up_name":"柠 萌","rid":172,"rname":"手机游戏","tid":2100,"tname":"攻略","aid":61662230},"player_args":{"aid":61662230,"cid":107238898,"type":"av"},"idx":1564654713,"three_point_v2":[{"title":"添加至稍后再看","type":"watch_later"},{"title":"反馈","subtitle":"(选择后将优化首页此类内容)","reasons":[{"id":1,"name":"恐怖血腥"},{"id":2,"name":"色情低俗"},{"id":3,"name":"封面恶心"},{"id":4,"name":"标题党/封面党"}],"type":"feedback"},{"title":"不感兴趣","subtitle":"(选择后将减少相似内容推荐)","reasons":[{"id":4,"name":"UP主:柠 萌"},{"id":2,"name":"分区:手机游戏"},{"id":3,"name":"频道:攻略"},{"id":1,"name":"不感兴趣"}],"type":"dislike"}],"cover_left_text_1":"2063","cover_left_icon_1":1,"cover_left_text_2":"25","cover_left_icon_2":3,"cover_right_text":"9:54","desc_button":{"text":"手机游戏 · 攻略","uri":"bilibili://pegasus/channel/2100","event":"channel_click","type":1,"event_v2":"channel"},"can_play":1},{"card_type":"cm_v2","card_goto":"ad_web_s","three_point":{"dislike_reasons":[{"id":1,"name":"不感兴趣"}]},"args":{},"idx":1564654712,"ad_info":{"creative_id":21565291,"creative_type":2,"card_type":3,"creative_content":{"title":"献给热爱FGO的你","description":"招商银行","image_url":"https://i0.hdslb.com/bfs/sycp/creative_img/201907/bf8d098b3943940fbbe7a229c0bf92bb.jpg_640x400.jpg","image_md5":"62f3751949063f94908a681c71b73e8c","url":"https://cm.bilibili.com/cm/api/fees/wise/redirect?ad_cb=COjNBhDA9RgY656kCiAyKAEw0DA46w5CITE1NjQ2NTQ3MTczODhxMTcyYTIyYTYwYTIzNnExNTY0MUjMk8HlxC1SBuWohOW6lVoG5rmW5Y2XYgbkuK3lm71oAXAAeICAgIDgBIABA4gBAJIBDjM2LjE1Ny4xNzguMTgxmgGwBGFsbDpkZWZhdWx0LGVjcG06ZGVmYXVsdCxjcGNUYWdGaWx0ZXI6dW5kZWZpbmVkLGVuaGFuY2VDdHJRRmFjdG9yOnNxdWFyZSxwbGF5cGFnZWN0cjplbmFibGVfY29uc3RhbnQsdXBfcmVjX2Zsb3dfY29udHJvbDp1bmRlZmluZWQsYnJ1c2hfZHVwbGljYXRlOmRlZmF1bHQscGN0cl9jcG06Y3BtLHBjdHJfdjI6bHJfY29uc3RhbnQsZHluYW1pY19mbG93X2NvbnRyb2w6c3BsaXQgdGhlIGZsb3cgYnkgbWlkLHBjdnI6ZGxkLGZyZXFMaW1pdDpkZWZhdWx0LHNtYWxsQ29uc3VtZVVuaXQ6ZGVmYXVsdCxvdXRlckJlYXRJbm5lcjpkZWZhdWx0LG91dGVyUXVpdDpkZWZhdWx0LGZkc19ydHQ6OCxjcGE6Y3BhXzMwZCxpbmRpc19VVjp1bmRlZmluZWQsaGFzaF9pbmRpc19VVjp1bmRlZmluZWQsZmVlZHNfcmFuZG9tX3Jlc3VsdDpkZWZhdWx0LGZsb3dfcmF0aW9fY2hlY2s6cjMsYmFzZV9oYXNoX2luZGlzX1VWOnVuZGVmaW5lZCxjdHJfdHJ1bmNhdGlvbl9leHA6dHJ1bmNhdGlvbl8xNTAsZG1wX2FnZV9leHA6dW5kZWZpbmVkLGNvbGRfYm9vdF9leHA6ZGVmYXVsdCxwbGF0Zm9ybTpkZWZhdWx0oAEyqAEtsgEgkDuw0OrDHgDt6D6Tg9G2PUuOCJy0p%2F%2BxxNcqVhORml26AWlodHRwczovL3Jlcy5jYy5jbWJpbWcuY29tL2l0YWZyb250L0Zyb2cvaW5kZXguaHRtbCMvbG9naW4vYXBpc2NmZ28vcmVtb3RlP3dlYkFkZHJlc3M9TjM3MDBNTTIwOTE0MTk5MDAwYmnCAaEBMjk1MF8xMjYyXzc0OF83MDJfNjQyXzU1OF81MTBfNDE4XzQxOF80MTJfNDEyXzQxMl80MDhfNDA4XzQwOF8zOThfMzk4XzM0OV8zNDlfMzQ5XzM0OV8zNDlfMzQ5XzMzOF8zMzhfMzM4XzMzOF8zMzhfMzM4XzMzM18zMjlfMzI5XzMyOV8zMjlfMzI5XzI5M18yOTNfMTUwXzE1MF8xMTPSAQDYASbgAcCaDOgBwJoM8AEA%2BAEygAICiAIAkgLnAjQxOTU4N18xNTY0NjQ4MTAwLDQxMzI1Ml8xNTY0NjQ4MTA5LDM3ODQxOV8xNTY0NjQ4MTE1LDQwNjAxN18xNTY0NjQ4MTUyLDM0NTQ2M18xNTY0NjQ4NDAxLDQxNDcyM18xNTY0NjQ4NDA5LDQwOTQwM18xNTY0NjQ4NDM1LDQxNTU5NF8xNTY0NjQ4NDUyLDQxNzMzNF8xNTY0NjQ4NDU2LDQxMDI2NV8xNTY0NjQ4NDYwLDQxMTAxOV8xNTY0NjQ4NDY0LDQxNDcyM18xNTY0NjQ4NDY4LDM1NTU0OF8xNTY0NjQ4NDcxLDQwOTQwM18xNTY0NjQ4NDg0LDQwNjE1N18xNTY0NjQ4NTA4LDQxOTY3N18xNTY0NjQ4NjIwLDQwNTk5MF8xNTY0NjQ4NjQ3LDM3ODQxOV8xNTY0NjQ5MzQ4LDQxODY1Ml8xNTY0NjQ5MzQ4LDQxODY3MV8xNTY0NjQ5Mzk0mAKpnCagArcZqAK%2B6ROwAo8NuAIAwAIAyAIA0AIA2AIA6gIA8AIA%2BAIAqAMA"},"ad_cb":"COjNBhDA9RgY656kCiAyKAEw0DA46w5CITE1NjQ2NTQ3MTczODhxMTcyYTIyYTYwYTIzNnExNTY0MUjMk8HlxC1SBuWohOW6lVoG5rmW5Y2XYgbkuK3lm71oAXAAeICAgIDgBIABA4gBAJIBDjM2LjE1Ny4xNzguMTgxmgGwBGFsbDpkZWZhdWx0LGVjcG06ZGVmYXVsdCxjcGNUYWdGaWx0ZXI6dW5kZWZpbmVkLGVuaGFuY2VDdHJRRmFjdG9yOnNxdWFyZSxwbGF5cGFnZWN0cjplbmFibGVfY29uc3RhbnQsdXBfcmVjX2Zsb3dfY29udHJvbDp1bmRlZmluZWQsYnJ1c2hfZHVwbGljYXRlOmRlZmF1bHQscGN0cl9jcG06Y3BtLHBjdHJfdjI6bHJfY29uc3RhbnQsZHluYW1pY19mbG93X2NvbnRyb2w6c3BsaXQgdGhlIGZsb3cgYnkgbWlkLHBjdnI6ZGxkLGZyZXFMaW1pdDpkZWZhdWx0LHNtYWxsQ29uc3VtZVVuaXQ6ZGVmYXVsdCxvdXRlckJlYXRJbm5lcjpkZWZhdWx0LG91dGVyUXVpdDpkZWZhdWx0LGZkc19ydHQ6OCxjcGE6Y3BhXzMwZCxpbmRpc19VVjp1bmRlZmluZWQsaGFzaF9pbmRpc19VVjp1bmRlZmluZWQsZmVlZHNfcmFuZG9tX3Jlc3VsdDpkZWZhdWx0LGZsb3dfcmF0aW9fY2hlY2s6cjMsYmFzZV9oYXNoX2luZGlzX1VWOnVuZGVmaW5lZCxjdHJfdHJ1bmNhdGlvbl9leHA6dHJ1bmNhdGlvbl8xNTAsZG1wX2FnZV9leHA6dW5kZWZpbmVkLGNvbGRfYm9vdF9leHA6ZGVmYXVsdCxwbGF0Zm9ybTpkZWZhdWx0oAEyqAEtsgEgkDuw0OrDHgDt6D6Tg9G2PUuOCJy0p/+xxNcqVhORml26AWlodHRwczovL3Jlcy5jYy5jbWJpbWcuY29tL2l0YWZyb250L0Zyb2cvaW5kZXguaHRtbCMvbG9naW4vYXBpc2NmZ28vcmVtb3RlP3dlYkFkZHJlc3M9TjM3MDBNTTIwOTE0MTk5MDAwYmnCAaEBMjk1MF8xMjYyXzc0OF83MDJfNjQyXzU1OF81MTBfNDE4XzQxOF80MTJfNDEyXzQxMl80MDhfNDA4XzQwOF8zOThfMzk4XzM0OV8zNDlfMzQ5XzM0OV8zNDlfMzQ5XzMzOF8zMzhfMzM4XzMzOF8zMzhfMzM4XzMzM18zMjlfMzI5XzMyOV8zMjlfMzI5XzI5M18yOTNfMTUwXzE1MF8xMTPSAQDYASbgAcCaDOgBwJoM8AEA+AEygAICiAIAkgLnAjQxOTU4N18xNTY0NjQ4MTAwLDQxMzI1Ml8xNTY0NjQ4MTA5LDM3ODQxOV8xNTY0NjQ4MTE1LDQwNjAxN18xNTY0NjQ4MTUyLDM0NTQ2M18xNTY0NjQ4NDAxLDQxNDcyM18xNTY0NjQ4NDA5LDQwOTQwM18xNTY0NjQ4NDM1LDQxNTU5NF8xNTY0NjQ4NDUyLDQxNzMzNF8xNTY0NjQ4NDU2LDQxMDI2NV8xNTY0NjQ4NDYwLDQxMTAxOV8xNTY0NjQ4NDY0LDQxNDcyM18xNTY0NjQ4NDY4LDM1NTU0OF8xNTY0NjQ4NDcxLDQwOTQwM18xNTY0NjQ4NDg0LDQwNjE1N18xNTY0NjQ4NTA4LDQxOTY3N18xNTY0NjQ4NjIwLDQwNTk5MF8xNTY0NjQ4NjQ3LDM3ODQxOV8xNTY0NjQ5MzQ4LDQxODY1Ml8xNTY0NjQ5MzQ4LDQxODY3MV8xNTY0NjQ5Mzk0mAKpnCagArcZqAK+6ROwAo8NuAIAwAIAyAIA0AIA2AIA6gIA8AIA+AIAqAMA","resource":1897,"source":1899,"request_id":"1564654717388q172a22a60a236q15641","is_ad":true,"cm_mark":1,"index":2,"is_ad_loc":true,"card_index":5,"client_ip":"36.157.178.181","extra":{"use_ad_web_v2":true,"show_urls":[],"click_urls":[],"download_whitelist":[],"open_whitelist":[],"card":{"card_type":3,"title":"献给热爱FGO的你","covers":[{"url":"https://i0.hdslb.com/bfs/sycp/creative_img/201907/bf8d098b3943940fbbe7a229c0bf92bb.jpg_640x400.jpg","loop":0}],"jump_url":"https://cm.bilibili.com/cm/api/fees/wise/redirect?ad_cb=COjNBhDA9RgY656kCiAyKAEw0DA46w5CITE1NjQ2NTQ3MTczODhxMTcyYTIyYTYwYTIzNnExNTY0MUjMk8HlxC1SBuWohOW6lVoG5rmW5Y2XYgbkuK3lm71oAXAAeICAgIDgBIABA4gBAJIBDjM2LjE1Ny4xNzguMTgxmgGwBGFsbDpkZWZhdWx0LGVjcG06ZGVmYXVsdCxjcGNUYWdGaWx0ZXI6dW5kZWZpbmVkLGVuaGFuY2VDdHJRRmFjdG9yOnNxdWFyZSxwbGF5cGFnZWN0cjplbmFibGVfY29uc3RhbnQsdXBfcmVjX2Zsb3dfY29udHJvbDp1bmRlZmluZWQsYnJ1c2hfZHVwbGljYXRlOmRlZmF1bHQscGN0cl9jcG06Y3BtLHBjdHJfdjI6bHJfY29uc3RhbnQsZHluYW1pY19mbG93X2NvbnRyb2w6c3BsaXQgdGhlIGZsb3cgYnkgbWlkLHBjdnI6ZGxkLGZyZXFMaW1pdDpkZWZhdWx0LHNtYWxsQ29uc3VtZVVuaXQ6ZGVmYXVsdCxvdXRlckJlYXRJbm5lcjpkZWZhdWx0LG91dGVyUXVpdDpkZWZhdWx0LGZkc19ydHQ6OCxjcGE6Y3BhXzMwZCxpbmRpc19VVjp1bmRlZmluZWQsaGFzaF9pbmRpc19VVjp1bmRlZmluZWQsZmVlZHNfcmFuZG9tX3Jlc3VsdDpkZWZhdWx0LGZsb3dfcmF0aW9fY2hlY2s6cjMsYmFzZV9oYXNoX2luZGlzX1VWOnVuZGVmaW5lZCxjdHJfdHJ1bmNhdGlvbl9leHA6dHJ1bmNhdGlvbl8xNTAsZG1wX2FnZV9leHA6dW5kZWZpbmVkLGNvbGRfYm9vdF9leHA6ZGVmYXVsdCxwbGF0Zm9ybTpkZWZhdWx0oAEyqAEtsgEgkDuw0OrDHgDt6D6Tg9G2PUuOCJy0p%2F%2BxxNcqVhORml26AWlodHRwczovL3Jlcy5jYy5jbWJpbWcuY29tL2l0YWZyb250L0Zyb2cvaW5kZXguaHRtbCMvbG9naW4vYXBpc2NmZ28vcmVtb3RlP3dlYkFkZHJlc3M9TjM3MDBNTTIwOTE0MTk5MDAwYmnCAaEBMjk1MF8xMjYyXzc0OF83MDJfNjQyXzU1OF81MTBfNDE4XzQxOF80MTJfNDEyXzQxMl80MDhfNDA4XzQwOF8zOThfMzk4XzM0OV8zNDlfMzQ5XzM0OV8zNDlfMzQ5XzMzOF8zMzhfMzM4XzMzOF8zMzhfMzM4XzMzM18zMjlfMzI5XzMyOV8zMjlfMzI5XzI5M18yOTNfMTUwXzE1MF8xMTPSAQDYASbgAcCaDOgBwJoM8AEA%2BAEygAICiAIAkgLnAjQxOTU4N18xNTY0NjQ4MTAwLDQxMzI1Ml8xNTY0NjQ4MTA5LDM3ODQxOV8xNTY0NjQ4MTE1LDQwNjAxN18xNTY0NjQ4MTUyLDM0NTQ2M18xNTY0NjQ4NDAxLDQxNDcyM18xNTY0NjQ4NDA5LDQwOTQwM18xNTY0NjQ4NDM1LDQxNTU5NF8xNTY0NjQ4NDUyLDQxNzMzNF8xNTY0NjQ4NDU2LDQxMDI2NV8xNTY0NjQ4NDYwLDQxMTAxOV8xNTY0NjQ4NDY0LDQxNDcyM18xNTY0NjQ4NDY4LDM1NTU0OF8xNTY0NjQ4NDcxLDQwOTQwM18xNTY0NjQ4NDg0LDQwNjE1N18xNTY0NjQ4NTA4LDQxOTY3N18xNTY0NjQ4NjIwLDQwNTk5MF8xNTY0NjQ4NjQ3LDM3ODQxOV8xNTY0NjQ5MzQ4LDQxODY1Ml8xNTY0NjQ5MzQ4LDQxODY3MV8xNTY0NjQ5Mzk0mAKpnCagArcZqAK%2B6ROwAo8NuAIAwAIAyAIA0AIA2AIA6gIA8AIA%2BAIAqAMA","desc":"招商银行","callup_url":"","long_desc":"","ad_tag":"","extra_desc":"","ad_tag_style":{"type":2,"text":"广告","text_color":"#999999FF","bg_border_color":"#999999FF"},"feedback_panel":{"panel_type_text":"广告","feedback_panel_detail":[{"text":"我不想看到这个广告","module_id":1,"jump_type":1,"icon_url":"https://i0.hdslb.com/bfs/sycp/mng/201907/a53df8f189bb12666a39d10ad1babcf5.png","jump_url":"","secondary_panel":[{"text":"不感兴趣","reason_id":1},{"text":"相似内容过多","reason_id":2},{"text":"广告质量差","reason_id":5}]},{"text":"举报","module_id":2,"jump_type":2,"icon_url":"https://i0.hdslb.com/bfs/sycp/mng/201907/2bc344ad3510da5cfdc7c7714abaeda4.png","jump_url":"http://cm.bilibili.com/ldad/light/ad-complain.html","secondary_panel":[]},{"text":"我为什么会看到此广告","module_id":3,"jump_type":2,"icon_url":"https://i0.hdslb.com/bfs/sycp/mng/201907/82480c4ef205c9b715d6e2ea7f5c4041.png","jump_url":"http://cm.bilibili.com/ldad/light/ad-introduce.html","secondary_panel":[]}]}},"report_time":2000,"sales_type":12,"special_industry":false,"special_industry_tips":"","preload_landingpage":0,"enable_download_dialog":false,"share_info":{}}},"three_point_v2":[{"title":"不感兴趣","type":"dislike","id":1}]}],"config":{"column":2,"autoplay_card":2,"feed_clean_abtest":0,"home_transfer_test":0}}
     */

    private int code;
    private String message;
    private int ttl;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTtl() {
        return ttl;
    }

    public void setTtl(int ttl) {
        this.ttl = ttl;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * items : [{"card_type":"banner_v2","card_goto":"banner","args":{},"idx":1564654716,"hash":"14536727619836272591","banner_item":[{"id":332204,"title":"局座 浅澄月终于面基了~","image":"http://i0.hdslb.com/bfs/archive/ca8b8b1dabf00e7c92072bc7da68302cbf84b888.jpg","hash":"5b61501892aee8e20467b71a58f2f0ef","uri":"https://www.bilibili.com/video/av61422525/","request_id":"1564654717451q172a22a48a149q14459","src_id":702,"is_ad_loc":true,"client_ip":"36.157.178.181","server_type":0,"resource_id":631,"index":1,"cm_mark":0},{"id":0,"title":"","image":"https://i0.hdslb.com/bfs/sycp/creative_img/201907/6661b7498c233b33c3bea90a0e87a21d.jpg","hash":"9be612cfba0399e39714065e98b61223","uri":"https://game.bilibili.com/indiegame/fb-h5","request_id":"1564654717451q172a22a48a149q14459","creative_id":259392610263814144,"src_id":703,"is_ad":true,"is_ad_loc":true,"ad_cb":"CAAQABiAoIvBxobjzAMgACgAMCQ4vwVCITE1NjQ2NTQ3MTc0NTFxMTcyYTIyYTQ4YTE0OXExNDQ1OUiLlMHlxC1SBuWohOW6lVoG5rmW5Y2XYgbkuK3lm71oAXAAeICAgIAQgAEAiAHvQJIBDjM2LjE1Ny4xNzguMTgxmgG5BGFsbDpjcGNfY3Jvd2RfdGFyZ2V0LGVjcG06ZGVmYXVsdCxjcGNUYWdGaWx0ZXI6dW5kZWZpbmVkLGVuaGFuY2VDdHJRRmFjdG9yOnNxdWFyZSxwbGF5cGFnZWN0cjplbmFibGVfY29uc3RhbnQsdXBfcmVjX2Zsb3dfY29udHJvbDp1bmRlZmluZWQsYnJ1c2hfZHVwbGljYXRlOmRlZmF1bHQscGN0cl9jcG06Y3BtLHBjdHJfdjI6bHJfY29uc3RhbnQsZHluYW1pY19mbG93X2NvbnRyb2w6c3BsaXQgdGhlIGZsb3cgYnkgbWlkLHBjdnI6ZGxkLGZyZXFMaW1pdDpkZWZhdWx0LHNtYWxsQ29uc3VtZVVuaXQ6ZGVmYXVsdCxvdXRlckJlYXRJbm5lcjpkZWZhdWx0LG91dGVyUXVpdDpkZWZhdWx0LGZkc19ydHQ6OCxjcGE6Y3BhXzMwZCxpbmRpc19VVjp1bmRlZmluZWQsaGFzaF9pbmRpc19VVjp1bmRlZmluZWQsZmVlZHNfcmFuZG9tX3Jlc3VsdDpkZWZhdWx0LGZsb3dfcmF0aW9fY2hlY2s6cjMsYmFzZV9oYXNoX2luZGlzX1VWOnVuZGVmaW5lZCxjdHJfdHJ1bmNhdGlvbl9leHA6dHJ1bmNhdGlvbl8xNTAsZG1wX2FnZV9leHA6dW5kZWZpbmVkLGNvbGRfYm9vdF9leHA6ZGVmYXVsdCxwbGF0Zm9ybTpkZWZhdWx0oAEAqAEAsgEgsKUaYcX+XTV3eWZWWHv6caz4hEzSXGMbD0D2hG1jnrK6ASlodHRwczovL2dhbWUuYmlsaWJpbGkuY29tL2luZGllZ2FtZS9mYi1oNcIBANIBANgBAeABAOgBAPABAPgBAIACAIgCALgCAMACAMgCANACANgCAOoCAPACie0D+ALmAagDAA==","client_ip":"36.157.178.181","server_type":1,"resource_id":631,"index":2,"cm_mark":1,"extra":{"use_ad_web_v2":false,"show_urls":[],"click_urls":[],"download_whitelist":[],"open_whitelist":[],"card":{"card_type":0,"title":"","covers":[{"url":"https://i0.hdslb.com/bfs/sycp/creative_img/201907/6661b7498c233b33c3bea90a0e87a21d.jpg","loop":0}],"jump_url":"https://game.bilibili.com/indiegame/fb-h5","desc":"","callup_url":"","long_desc":"","ad_tag":"","extra_desc":"","ad_tag_style":{"type":2,"text":"广告","text_color":"#999999FF","bg_border_color":"#999999FF"},"feedback_panel":{"panel_type_text":"广告","feedback_panel_detail":[]}},"report_time":2000,"sales_type":31,"special_industry":false,"special_industry_tips":"","preload_landingpage":0,"share_info":{}}},{"id":0,"title":"","image":"https://i0.hdslb.com/bfs/sycp/creative_img/201907/3d6d43833a59b44b7ed1fade8420412e.jpg","hash":"4b7010ed8ca4750a31a068cb2ae0d621","uri":"bilibili://game_center/detail?id=102057&sourceFrom=782&sourceType=adPut","request_id":"1564654717451q172a22a48a149q14459","creative_id":259379263577444352,"src_id":704,"is_ad":true,"is_ad_loc":true,"ad_cb":"CAAQABiAoIudjoLgzAMgACgAMCQ4wAVCITE1NjQ2NTQ3MTc0NTFxMTcyYTIyYTQ4YTE0OXExNDQ1OUiLlMHlxC1SBuWohOW6lVoG5rmW5Y2XYgbkuK3lm71oAXAAeICAgIAQgAEAiAHyQJIBDjM2LjE1Ny4xNzguMTgxmgG5BGFsbDpjcGNfY3Jvd2RfdGFyZ2V0LGVjcG06ZGVmYXVsdCxjcGNUYWdGaWx0ZXI6dW5kZWZpbmVkLGVuaGFuY2VDdHJRRmFjdG9yOnNxdWFyZSxwbGF5cGFnZWN0cjplbmFibGVfY29uc3RhbnQsdXBfcmVjX2Zsb3dfY29udHJvbDp1bmRlZmluZWQsYnJ1c2hfZHVwbGljYXRlOmRlZmF1bHQscGN0cl9jcG06Y3BtLHBjdHJfdjI6bHJfY29uc3RhbnQsZHluYW1pY19mbG93X2NvbnRyb2w6c3BsaXQgdGhlIGZsb3cgYnkgbWlkLHBjdnI6ZGxkLGZyZXFMaW1pdDpkZWZhdWx0LHNtYWxsQ29uc3VtZVVuaXQ6ZGVmYXVsdCxvdXRlckJlYXRJbm5lcjpkZWZhdWx0LG91dGVyUXVpdDpkZWZhdWx0LGZkc19ydHQ6OCxjcGE6Y3BhXzMwZCxpbmRpc19VVjp1bmRlZmluZWQsaGFzaF9pbmRpc19VVjp1bmRlZmluZWQsZmVlZHNfcmFuZG9tX3Jlc3VsdDpkZWZhdWx0LGZsb3dfcmF0aW9fY2hlY2s6cjMsYmFzZV9oYXNoX2luZGlzX1VWOnVuZGVmaW5lZCxjdHJfdHJ1bmNhdGlvbl9leHA6dHJ1bmNhdGlvbl8xNTAsZG1wX2FnZV9leHA6dW5kZWZpbmVkLGNvbGRfYm9vdF9leHA6ZGVmYXVsdCxwbGF0Zm9ybTpkZWZhdWx0oAEAqAEAsgEgOH58cHYj+YY7oRcqen/JaskRYtS52etTy0E6n5U3tqy6AUdiaWxpYmlsaTovL2dhbWVfY2VudGVyL2RldGFpbD9pZD0xMDIwNTcmc291cmNlRnJvbT03ODImc291cmNlVHlwZT1hZFB1dMIBANIBANgBAeABAOgBAPABAPgBAIACAIgCALgCAMACAMgCANACANgCAOoCAPACve0D+ALmAagDAA==","click_url":"https://ad-bili-data.biligame.com/api/mobile/clickBili?ad_plan_id=36594&mid=__MID__&os=0&idfa=__IDFA__&buvid=__BUVID__&android_id=__ANDROIDID__&imei=__IMEI__&mac=__MAC__&duid=__DUID__&ip=36.157.178.181&request_id=1564654717451q172a22a48a149q14459&ts=__TS__&ua=__UA__","client_ip":"36.157.178.181","server_type":1,"resource_id":631,"index":3,"cm_mark":1,"extra":{"use_ad_web_v2":false,"show_urls":[],"click_urls":["https://ad-bili-data.biligame.com/api/mobile/clickBili?ad_plan_id=36594&mid=__MID__&os=0&idfa=__IDFA__&buvid=__BUVID__&android_id=__ANDROIDID__&imei=__IMEI__&mac=__MAC__&duid=__DUID__&ip=36.157.178.181&request_id=1564654717451q172a22a48a149q14459&ts=__TS__&ua=__UA__"],"download_whitelist":[],"open_whitelist":[],"card":{"card_type":0,"title":"","covers":[{"url":"https://i0.hdslb.com/bfs/sycp/creative_img/201907/3d6d43833a59b44b7ed1fade8420412e.jpg","loop":0}],"jump_url":"bilibili://game_center/detail?id=102057&sourceFrom=782&sourceType=adPut","desc":"","callup_url":"","long_desc":"","ad_tag":"","extra_desc":"","ad_tag_style":{"type":2,"text":"广告","text_color":"#999999FF","bg_border_color":"#999999FF"},"feedback_panel":{"panel_type_text":"广告","feedback_panel_detail":[]}},"report_time":2000,"sales_type":31,"special_industry":false,"special_industry_tips":"","preload_landingpage":0,"share_info":{}}},{"id":332363,"title":"李宇春音乐创作历程大公开","image":"http://i0.hdslb.com/bfs/archive/217f10fefc72a7132bce70c2d5967a08e1807262.png","hash":"0d544791be7a546be671773b1a3f0fb1","uri":"https://www.bilibili.com/blackboard/topic/activity-fmRYzMG7U.html","request_id":"1564654717451q172a22a48a149q14459","src_id":705,"is_ad_loc":true,"client_ip":"36.157.178.181","server_type":0,"resource_id":631,"index":4,"cm_mark":0},{"id":332354,"title":"乘着浪潮前进","image":"http://i0.hdslb.com/bfs/archive/214e7483f3c962cb6f598a72764714a993947f76.jpg","hash":"89c8d6fed96c95e64cdc080e15ef885b","uri":"https://www.bilibili.com/read/cv3117784","request_id":"1564654717451q172a22a48a149q14459","src_id":1654,"is_ad_loc":true,"client_ip":"36.157.178.181","server_type":0,"resource_id":631,"index":5,"cm_mark":0}]},{"card_type":"small_cover_v2","card_goto":"live","goto":"live","param":"15081","cover":"http://i0.hdslb.com/bfs/live/f0971acb01e533e941fd2c739c6f637a1862b035.jpg","title":"【CSGO】白给狐狸","uri":"https://live.bilibili.com/15081?broadcast_type=0","three_point":{"dislike_reasons":[{"id":4,"name":"UP主:唧唧歪歪丶萌"},{"id":2,"name":"分区:CS:GO"},{"id":1,"name":"不感兴趣"}]},"args":{"up_id":238588,"up_name":"唧唧歪歪丶萌","rid":2,"rname":"网游","tid":89,"tname":"CS:GO"},"player_args":{"is_live":1,"room_id":15081,"type":"live"},"idx":1564655647,"three_point_v2":[{"title":"不感兴趣","subtitle":"(选择后将减少相似内容推荐)","reasons":[{"id":4,"name":"UP主:唧唧歪歪丶萌"},{"id":2,"name":"分区:CS:GO"},{"id":1,"name":"不感兴趣"}],"type":"dislike"}],"cover_left_text_1":"443","cover_left_icon_1":2,"cover_right_text":"唧唧歪歪丶萌","badge":"直播","rcmd_reason":"已关注","official_icon":16,"can_play":1,"rcmd_reason_style":{"text":"已关注","text_color":"#FFFFFFFF","bg_color":"#FFFB9E60","border_color":"#FFFB9E60","bg_style":1}},{"card_type":"small_cover_v2","card_goto":"av","goto":"av","param":"61662230","cover":"http://i2.hdslb.com/bfs/archive/d672f1cb72f122b96fb336407e836dacaea227c9.jpg","title":"明日方舟 三人H5-4  甲之蜜糖 乙之砒霜","uri":"bilibili://video/61662230?page=1&player_preload=%7B%22expire_time%22%3A1564658317%2C%22cid%22%3A107238898%2C%22support_quality%22%3A%5B116%2C74%2C80%2C64%2C32%2C16%5D%2C%22support_formats%22%3A%5B%22flv_p60%22%2C%22flv720_p60%22%2C%22flv%22%2C%22flv720%22%2C%22flv480%22%2C%22flv360%22%5D%2C%22support_description%22%3A%5B%22%E9%AB%98%E6%B8%85%201080P60%22%2C%22%E9%AB%98%E6%B8%85%20720P60%22%2C%22%E9%AB%98%E6%B8%85%201080P%22%2C%22%E9%AB%98%E6%B8%85%20720P%22%2C%22%E6%B8%85%E6%99%B0%20480P%22%2C%22%E6%B5%81%E7%95%85%20360P%22%5D%2C%22quality%22%3A32%2C%22url%22%3A%22http%3A%2F%2Fupos-hz-mirrorcosu.acgvideo.com%2Fupgcxcode%2F98%2F88%2F107238898%2F107238898-1-32.flv%3Fe%3Dig8euxZM2rNcNbNB7Wua7EMg7WUa7zTEto8g5X10ugNcXBlqNCNEto8g5gNvNE3DN0B5tZlqNxTEto8BTrNvN05fqx6S5ahE9IMvXBvE2ENvNCImNEVEK9GVqJIwqa80WXIekXRE9IB5QK%3D%3D%5Cu0026trid%3D3158ddf60f6b4c4a8a74705903b717b0%5Cu0026oi%3D614314677%5Cu0026platform%3Dandroid%5Cu0026gen%3Dplayurlbatch%5Cu0026uipk%3D5%5Cu0026os%3Dcosu%5Cu0026nbs%3D1%5Cu0026deadline%3D1564661917%5Cu0026upsig%3D45208311fc9ad43779e5504b7cb49f65%5Cu0026uparams%3De%2Ctrid%2Coi%2Cplatform%2Cgen%2Cuipk%2Cos%2Cnbs%2Cdeadline%22%2C%22file_info%22%3A%7B%22116%22%3A%7B%22infos%22%3A%5B%7B%22filesize%22%3A285890454%2C%22timelength%22%3A370674%7D%5D%7D%2C%2216%22%3A%7B%22infos%22%3A%5B%7B%22filesize%22%3A21598003%2C%22timelength%22%3A370708%7D%5D%7D%2C%2232%22%3A%7B%22infos%22%3A%5B%7B%22filesize%22%3A55775440%2C%22timelength%22%3A370708%7D%5D%7D%2C%2264%22%3A%7B%22infos%22%3A%5B%7B%22filesize%22%3A105295347%2C%22timelength%22%3A370708%7D%5D%7D%2C%2274%22%3A%7B%22infos%22%3A%5B%7B%22filesize%22%3A150548725%2C%22timelength%22%3A370674%7D%5D%7D%2C%2280%22%3A%7B%22infos%22%3A%5B%7B%22filesize%22%3A150324492%2C%22timelength%22%3A370708%7D%5D%7D%7D%2C%22video_codecid%22%3A7%2C%22video_project%22%3Atrue%2C%22fnver%22%3A0%2C%22fnval%22%3A0%7D&player_width=1456&player_height=816&player_rotate=0&trackid=all_16.shylf-ai-recsys-313.1564654717459.26","three_point":{"dislike_reasons":[{"id":4,"name":"UP主:柠 萌"},{"id":2,"name":"分区:手机游戏"},{"id":3,"name":"频道:攻略"},{"id":1,"name":"不感兴趣"}],"feedbacks":[{"id":1,"name":"恐怖血腥"},{"id":2,"name":"色情低俗"},{"id":3,"name":"封面恶心"},{"id":4,"name":"标题党/封面党"}],"watch_later":1},"args":{"up_id":632167,"up_name":"柠 萌","rid":172,"rname":"手机游戏","tid":2100,"tname":"攻略","aid":61662230},"player_args":{"aid":61662230,"cid":107238898,"type":"av"},"idx":1564654713,"three_point_v2":[{"title":"添加至稍后再看","type":"watch_later"},{"title":"反馈","subtitle":"(选择后将优化首页此类内容)","reasons":[{"id":1,"name":"恐怖血腥"},{"id":2,"name":"色情低俗"},{"id":3,"name":"封面恶心"},{"id":4,"name":"标题党/封面党"}],"type":"feedback"},{"title":"不感兴趣","subtitle":"(选择后将减少相似内容推荐)","reasons":[{"id":4,"name":"UP主:柠 萌"},{"id":2,"name":"分区:手机游戏"},{"id":3,"name":"频道:攻略"},{"id":1,"name":"不感兴趣"}],"type":"dislike"}],"cover_left_text_1":"2063","cover_left_icon_1":1,"cover_left_text_2":"25","cover_left_icon_2":3,"cover_right_text":"9:54","desc_button":{"text":"手机游戏 · 攻略","uri":"bilibili://pegasus/channel/2100","event":"channel_click","type":1,"event_v2":"channel"},"can_play":1},{"card_type":"cm_v2","card_goto":"ad_web_s","three_point":{"dislike_reasons":[{"id":1,"name":"不感兴趣"}]},"args":{},"idx":1564654712,"ad_info":{"creative_id":21565291,"creative_type":2,"card_type":3,"creative_content":{"title":"献给热爱FGO的你","description":"招商银行","image_url":"https://i0.hdslb.com/bfs/sycp/creative_img/201907/bf8d098b3943940fbbe7a229c0bf92bb.jpg_640x400.jpg","image_md5":"62f3751949063f94908a681c71b73e8c","url":"https://cm.bilibili.com/cm/api/fees/wise/redirect?ad_cb=COjNBhDA9RgY656kCiAyKAEw0DA46w5CITE1NjQ2NTQ3MTczODhxMTcyYTIyYTYwYTIzNnExNTY0MUjMk8HlxC1SBuWohOW6lVoG5rmW5Y2XYgbkuK3lm71oAXAAeICAgIDgBIABA4gBAJIBDjM2LjE1Ny4xNzguMTgxmgGwBGFsbDpkZWZhdWx0LGVjcG06ZGVmYXVsdCxjcGNUYWdGaWx0ZXI6dW5kZWZpbmVkLGVuaGFuY2VDdHJRRmFjdG9yOnNxdWFyZSxwbGF5cGFnZWN0cjplbmFibGVfY29uc3RhbnQsdXBfcmVjX2Zsb3dfY29udHJvbDp1bmRlZmluZWQsYnJ1c2hfZHVwbGljYXRlOmRlZmF1bHQscGN0cl9jcG06Y3BtLHBjdHJfdjI6bHJfY29uc3RhbnQsZHluYW1pY19mbG93X2NvbnRyb2w6c3BsaXQgdGhlIGZsb3cgYnkgbWlkLHBjdnI6ZGxkLGZyZXFMaW1pdDpkZWZhdWx0LHNtYWxsQ29uc3VtZVVuaXQ6ZGVmYXVsdCxvdXRlckJlYXRJbm5lcjpkZWZhdWx0LG91dGVyUXVpdDpkZWZhdWx0LGZkc19ydHQ6OCxjcGE6Y3BhXzMwZCxpbmRpc19VVjp1bmRlZmluZWQsaGFzaF9pbmRpc19VVjp1bmRlZmluZWQsZmVlZHNfcmFuZG9tX3Jlc3VsdDpkZWZhdWx0LGZsb3dfcmF0aW9fY2hlY2s6cjMsYmFzZV9oYXNoX2luZGlzX1VWOnVuZGVmaW5lZCxjdHJfdHJ1bmNhdGlvbl9leHA6dHJ1bmNhdGlvbl8xNTAsZG1wX2FnZV9leHA6dW5kZWZpbmVkLGNvbGRfYm9vdF9leHA6ZGVmYXVsdCxwbGF0Zm9ybTpkZWZhdWx0oAEyqAEtsgEgkDuw0OrDHgDt6D6Tg9G2PUuOCJy0p%2F%2BxxNcqVhORml26AWlodHRwczovL3Jlcy5jYy5jbWJpbWcuY29tL2l0YWZyb250L0Zyb2cvaW5kZXguaHRtbCMvbG9naW4vYXBpc2NmZ28vcmVtb3RlP3dlYkFkZHJlc3M9TjM3MDBNTTIwOTE0MTk5MDAwYmnCAaEBMjk1MF8xMjYyXzc0OF83MDJfNjQyXzU1OF81MTBfNDE4XzQxOF80MTJfNDEyXzQxMl80MDhfNDA4XzQwOF8zOThfMzk4XzM0OV8zNDlfMzQ5XzM0OV8zNDlfMzQ5XzMzOF8zMzhfMzM4XzMzOF8zMzhfMzM4XzMzM18zMjlfMzI5XzMyOV8zMjlfMzI5XzI5M18yOTNfMTUwXzE1MF8xMTPSAQDYASbgAcCaDOgBwJoM8AEA%2BAEygAICiAIAkgLnAjQxOTU4N18xNTY0NjQ4MTAwLDQxMzI1Ml8xNTY0NjQ4MTA5LDM3ODQxOV8xNTY0NjQ4MTE1LDQwNjAxN18xNTY0NjQ4MTUyLDM0NTQ2M18xNTY0NjQ4NDAxLDQxNDcyM18xNTY0NjQ4NDA5LDQwOTQwM18xNTY0NjQ4NDM1LDQxNTU5NF8xNTY0NjQ4NDUyLDQxNzMzNF8xNTY0NjQ4NDU2LDQxMDI2NV8xNTY0NjQ4NDYwLDQxMTAxOV8xNTY0NjQ4NDY0LDQxNDcyM18xNTY0NjQ4NDY4LDM1NTU0OF8xNTY0NjQ4NDcxLDQwOTQwM18xNTY0NjQ4NDg0LDQwNjE1N18xNTY0NjQ4NTA4LDQxOTY3N18xNTY0NjQ4NjIwLDQwNTk5MF8xNTY0NjQ4NjQ3LDM3ODQxOV8xNTY0NjQ5MzQ4LDQxODY1Ml8xNTY0NjQ5MzQ4LDQxODY3MV8xNTY0NjQ5Mzk0mAKpnCagArcZqAK%2B6ROwAo8NuAIAwAIAyAIA0AIA2AIA6gIA8AIA%2BAIAqAMA"},"ad_cb":"COjNBhDA9RgY656kCiAyKAEw0DA46w5CITE1NjQ2NTQ3MTczODhxMTcyYTIyYTYwYTIzNnExNTY0MUjMk8HlxC1SBuWohOW6lVoG5rmW5Y2XYgbkuK3lm71oAXAAeICAgIDgBIABA4gBAJIBDjM2LjE1Ny4xNzguMTgxmgGwBGFsbDpkZWZhdWx0LGVjcG06ZGVmYXVsdCxjcGNUYWdGaWx0ZXI6dW5kZWZpbmVkLGVuaGFuY2VDdHJRRmFjdG9yOnNxdWFyZSxwbGF5cGFnZWN0cjplbmFibGVfY29uc3RhbnQsdXBfcmVjX2Zsb3dfY29udHJvbDp1bmRlZmluZWQsYnJ1c2hfZHVwbGljYXRlOmRlZmF1bHQscGN0cl9jcG06Y3BtLHBjdHJfdjI6bHJfY29uc3RhbnQsZHluYW1pY19mbG93X2NvbnRyb2w6c3BsaXQgdGhlIGZsb3cgYnkgbWlkLHBjdnI6ZGxkLGZyZXFMaW1pdDpkZWZhdWx0LHNtYWxsQ29uc3VtZVVuaXQ6ZGVmYXVsdCxvdXRlckJlYXRJbm5lcjpkZWZhdWx0LG91dGVyUXVpdDpkZWZhdWx0LGZkc19ydHQ6OCxjcGE6Y3BhXzMwZCxpbmRpc19VVjp1bmRlZmluZWQsaGFzaF9pbmRpc19VVjp1bmRlZmluZWQsZmVlZHNfcmFuZG9tX3Jlc3VsdDpkZWZhdWx0LGZsb3dfcmF0aW9fY2hlY2s6cjMsYmFzZV9oYXNoX2luZGlzX1VWOnVuZGVmaW5lZCxjdHJfdHJ1bmNhdGlvbl9leHA6dHJ1bmNhdGlvbl8xNTAsZG1wX2FnZV9leHA6dW5kZWZpbmVkLGNvbGRfYm9vdF9leHA6ZGVmYXVsdCxwbGF0Zm9ybTpkZWZhdWx0oAEyqAEtsgEgkDuw0OrDHgDt6D6Tg9G2PUuOCJy0p/+xxNcqVhORml26AWlodHRwczovL3Jlcy5jYy5jbWJpbWcuY29tL2l0YWZyb250L0Zyb2cvaW5kZXguaHRtbCMvbG9naW4vYXBpc2NmZ28vcmVtb3RlP3dlYkFkZHJlc3M9TjM3MDBNTTIwOTE0MTk5MDAwYmnCAaEBMjk1MF8xMjYyXzc0OF83MDJfNjQyXzU1OF81MTBfNDE4XzQxOF80MTJfNDEyXzQxMl80MDhfNDA4XzQwOF8zOThfMzk4XzM0OV8zNDlfMzQ5XzM0OV8zNDlfMzQ5XzMzOF8zMzhfMzM4XzMzOF8zMzhfMzM4XzMzM18zMjlfMzI5XzMyOV8zMjlfMzI5XzI5M18yOTNfMTUwXzE1MF8xMTPSAQDYASbgAcCaDOgBwJoM8AEA+AEygAICiAIAkgLnAjQxOTU4N18xNTY0NjQ4MTAwLDQxMzI1Ml8xNTY0NjQ4MTA5LDM3ODQxOV8xNTY0NjQ4MTE1LDQwNjAxN18xNTY0NjQ4MTUyLDM0NTQ2M18xNTY0NjQ4NDAxLDQxNDcyM18xNTY0NjQ4NDA5LDQwOTQwM18xNTY0NjQ4NDM1LDQxNTU5NF8xNTY0NjQ4NDUyLDQxNzMzNF8xNTY0NjQ4NDU2LDQxMDI2NV8xNTY0NjQ4NDYwLDQxMTAxOV8xNTY0NjQ4NDY0LDQxNDcyM18xNTY0NjQ4NDY4LDM1NTU0OF8xNTY0NjQ4NDcxLDQwOTQwM18xNTY0NjQ4NDg0LDQwNjE1N18xNTY0NjQ4NTA4LDQxOTY3N18xNTY0NjQ4NjIwLDQwNTk5MF8xNTY0NjQ4NjQ3LDM3ODQxOV8xNTY0NjQ5MzQ4LDQxODY1Ml8xNTY0NjQ5MzQ4LDQxODY3MV8xNTY0NjQ5Mzk0mAKpnCagArcZqAK+6ROwAo8NuAIAwAIAyAIA0AIA2AIA6gIA8AIA+AIAqAMA","resource":1897,"source":1899,"request_id":"1564654717388q172a22a60a236q15641","is_ad":true,"cm_mark":1,"index":2,"is_ad_loc":true,"card_index":5,"client_ip":"36.157.178.181","extra":{"use_ad_web_v2":true,"show_urls":[],"click_urls":[],"download_whitelist":[],"open_whitelist":[],"card":{"card_type":3,"title":"献给热爱FGO的你","covers":[{"url":"https://i0.hdslb.com/bfs/sycp/creative_img/201907/bf8d098b3943940fbbe7a229c0bf92bb.jpg_640x400.jpg","loop":0}],"jump_url":"https://cm.bilibili.com/cm/api/fees/wise/redirect?ad_cb=COjNBhDA9RgY656kCiAyKAEw0DA46w5CITE1NjQ2NTQ3MTczODhxMTcyYTIyYTYwYTIzNnExNTY0MUjMk8HlxC1SBuWohOW6lVoG5rmW5Y2XYgbkuK3lm71oAXAAeICAgIDgBIABA4gBAJIBDjM2LjE1Ny4xNzguMTgxmgGwBGFsbDpkZWZhdWx0LGVjcG06ZGVmYXVsdCxjcGNUYWdGaWx0ZXI6dW5kZWZpbmVkLGVuaGFuY2VDdHJRRmFjdG9yOnNxdWFyZSxwbGF5cGFnZWN0cjplbmFibGVfY29uc3RhbnQsdXBfcmVjX2Zsb3dfY29udHJvbDp1bmRlZmluZWQsYnJ1c2hfZHVwbGljYXRlOmRlZmF1bHQscGN0cl9jcG06Y3BtLHBjdHJfdjI6bHJfY29uc3RhbnQsZHluYW1pY19mbG93X2NvbnRyb2w6c3BsaXQgdGhlIGZsb3cgYnkgbWlkLHBjdnI6ZGxkLGZyZXFMaW1pdDpkZWZhdWx0LHNtYWxsQ29uc3VtZVVuaXQ6ZGVmYXVsdCxvdXRlckJlYXRJbm5lcjpkZWZhdWx0LG91dGVyUXVpdDpkZWZhdWx0LGZkc19ydHQ6OCxjcGE6Y3BhXzMwZCxpbmRpc19VVjp1bmRlZmluZWQsaGFzaF9pbmRpc19VVjp1bmRlZmluZWQsZmVlZHNfcmFuZG9tX3Jlc3VsdDpkZWZhdWx0LGZsb3dfcmF0aW9fY2hlY2s6cjMsYmFzZV9oYXNoX2luZGlzX1VWOnVuZGVmaW5lZCxjdHJfdHJ1bmNhdGlvbl9leHA6dHJ1bmNhdGlvbl8xNTAsZG1wX2FnZV9leHA6dW5kZWZpbmVkLGNvbGRfYm9vdF9leHA6ZGVmYXVsdCxwbGF0Zm9ybTpkZWZhdWx0oAEyqAEtsgEgkDuw0OrDHgDt6D6Tg9G2PUuOCJy0p%2F%2BxxNcqVhORml26AWlodHRwczovL3Jlcy5jYy5jbWJpbWcuY29tL2l0YWZyb250L0Zyb2cvaW5kZXguaHRtbCMvbG9naW4vYXBpc2NmZ28vcmVtb3RlP3dlYkFkZHJlc3M9TjM3MDBNTTIwOTE0MTk5MDAwYmnCAaEBMjk1MF8xMjYyXzc0OF83MDJfNjQyXzU1OF81MTBfNDE4XzQxOF80MTJfNDEyXzQxMl80MDhfNDA4XzQwOF8zOThfMzk4XzM0OV8zNDlfMzQ5XzM0OV8zNDlfMzQ5XzMzOF8zMzhfMzM4XzMzOF8zMzhfMzM4XzMzM18zMjlfMzI5XzMyOV8zMjlfMzI5XzI5M18yOTNfMTUwXzE1MF8xMTPSAQDYASbgAcCaDOgBwJoM8AEA%2BAEygAICiAIAkgLnAjQxOTU4N18xNTY0NjQ4MTAwLDQxMzI1Ml8xNTY0NjQ4MTA5LDM3ODQxOV8xNTY0NjQ4MTE1LDQwNjAxN18xNTY0NjQ4MTUyLDM0NTQ2M18xNTY0NjQ4NDAxLDQxNDcyM18xNTY0NjQ4NDA5LDQwOTQwM18xNTY0NjQ4NDM1LDQxNTU5NF8xNTY0NjQ4NDUyLDQxNzMzNF8xNTY0NjQ4NDU2LDQxMDI2NV8xNTY0NjQ4NDYwLDQxMTAxOV8xNTY0NjQ4NDY0LDQxNDcyM18xNTY0NjQ4NDY4LDM1NTU0OF8xNTY0NjQ4NDcxLDQwOTQwM18xNTY0NjQ4NDg0LDQwNjE1N18xNTY0NjQ4NTA4LDQxOTY3N18xNTY0NjQ4NjIwLDQwNTk5MF8xNTY0NjQ4NjQ3LDM3ODQxOV8xNTY0NjQ5MzQ4LDQxODY1Ml8xNTY0NjQ5MzQ4LDQxODY3MV8xNTY0NjQ5Mzk0mAKpnCagArcZqAK%2B6ROwAo8NuAIAwAIAyAIA0AIA2AIA6gIA8AIA%2BAIAqAMA","desc":"招商银行","callup_url":"","long_desc":"","ad_tag":"","extra_desc":"","ad_tag_style":{"type":2,"text":"广告","text_color":"#999999FF","bg_border_color":"#999999FF"},"feedback_panel":{"panel_type_text":"广告","feedback_panel_detail":[{"text":"我不想看到这个广告","module_id":1,"jump_type":1,"icon_url":"https://i0.hdslb.com/bfs/sycp/mng/201907/a53df8f189bb12666a39d10ad1babcf5.png","jump_url":"","secondary_panel":[{"text":"不感兴趣","reason_id":1},{"text":"相似内容过多","reason_id":2},{"text":"广告质量差","reason_id":5}]},{"text":"举报","module_id":2,"jump_type":2,"icon_url":"https://i0.hdslb.com/bfs/sycp/mng/201907/2bc344ad3510da5cfdc7c7714abaeda4.png","jump_url":"http://cm.bilibili.com/ldad/light/ad-complain.html","secondary_panel":[]},{"text":"我为什么会看到此广告","module_id":3,"jump_type":2,"icon_url":"https://i0.hdslb.com/bfs/sycp/mng/201907/82480c4ef205c9b715d6e2ea7f5c4041.png","jump_url":"http://cm.bilibili.com/ldad/light/ad-introduce.html","secondary_panel":[]}]}},"report_time":2000,"sales_type":12,"special_industry":false,"special_industry_tips":"","preload_landingpage":0,"enable_download_dialog":false,"share_info":{}}},"three_point_v2":[{"title":"不感兴趣","type":"dislike","id":1}]}]
         * config : {"column":2,"autoplay_card":2,"feed_clean_abtest":0,"home_transfer_test":0}
         */

        private ConfigBean config;
        private List<ItemsBean> items;

        public ConfigBean getConfig() {
            return config;
        }

        public void setConfig(ConfigBean config) {
            this.config = config;
        }

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        public static class ConfigBean {
            /**
             * column : 2
             * autoplay_card : 2
             * feed_clean_abtest : 0
             * home_transfer_test : 0
             */

            private int column;
            private int autoplay_card;
            private int feed_clean_abtest;
            private int home_transfer_test;

            public int getColumn() {
                return column;
            }

            public void setColumn(int column) {
                this.column = column;
            }

            public int getAutoplay_card() {
                return autoplay_card;
            }

            public void setAutoplay_card(int autoplay_card) {
                this.autoplay_card = autoplay_card;
            }

            public int getFeed_clean_abtest() {
                return feed_clean_abtest;
            }

            public void setFeed_clean_abtest(int feed_clean_abtest) {
                this.feed_clean_abtest = feed_clean_abtest;
            }

            public int getHome_transfer_test() {
                return home_transfer_test;
            }

            public void setHome_transfer_test(int home_transfer_test) {
                this.home_transfer_test = home_transfer_test;
            }
        }

        public static class ItemsBean {
            /**
             * card_type : banner_v2
             * card_goto : banner
             * args : {}
             * idx : 1564654716
             * hash : 14536727619836272591
             * banner_item : [{"id":332204,"title":"局座 浅澄月终于面基了~","image":"http://i0.hdslb.com/bfs/archive/ca8b8b1dabf00e7c92072bc7da68302cbf84b888.jpg","hash":"5b61501892aee8e20467b71a58f2f0ef","uri":"https://www.bilibili.com/video/av61422525/","request_id":"1564654717451q172a22a48a149q14459","src_id":702,"is_ad_loc":true,"client_ip":"36.157.178.181","server_type":0,"resource_id":631,"index":1,"cm_mark":0},{"id":0,"title":"","image":"https://i0.hdslb.com/bfs/sycp/creative_img/201907/6661b7498c233b33c3bea90a0e87a21d.jpg","hash":"9be612cfba0399e39714065e98b61223","uri":"https://game.bilibili.com/indiegame/fb-h5","request_id":"1564654717451q172a22a48a149q14459","creative_id":259392610263814144,"src_id":703,"is_ad":true,"is_ad_loc":true,"ad_cb":"CAAQABiAoIvBxobjzAMgACgAMCQ4vwVCITE1NjQ2NTQ3MTc0NTFxMTcyYTIyYTQ4YTE0OXExNDQ1OUiLlMHlxC1SBuWohOW6lVoG5rmW5Y2XYgbkuK3lm71oAXAAeICAgIAQgAEAiAHvQJIBDjM2LjE1Ny4xNzguMTgxmgG5BGFsbDpjcGNfY3Jvd2RfdGFyZ2V0LGVjcG06ZGVmYXVsdCxjcGNUYWdGaWx0ZXI6dW5kZWZpbmVkLGVuaGFuY2VDdHJRRmFjdG9yOnNxdWFyZSxwbGF5cGFnZWN0cjplbmFibGVfY29uc3RhbnQsdXBfcmVjX2Zsb3dfY29udHJvbDp1bmRlZmluZWQsYnJ1c2hfZHVwbGljYXRlOmRlZmF1bHQscGN0cl9jcG06Y3BtLHBjdHJfdjI6bHJfY29uc3RhbnQsZHluYW1pY19mbG93X2NvbnRyb2w6c3BsaXQgdGhlIGZsb3cgYnkgbWlkLHBjdnI6ZGxkLGZyZXFMaW1pdDpkZWZhdWx0LHNtYWxsQ29uc3VtZVVuaXQ6ZGVmYXVsdCxvdXRlckJlYXRJbm5lcjpkZWZhdWx0LG91dGVyUXVpdDpkZWZhdWx0LGZkc19ydHQ6OCxjcGE6Y3BhXzMwZCxpbmRpc19VVjp1bmRlZmluZWQsaGFzaF9pbmRpc19VVjp1bmRlZmluZWQsZmVlZHNfcmFuZG9tX3Jlc3VsdDpkZWZhdWx0LGZsb3dfcmF0aW9fY2hlY2s6cjMsYmFzZV9oYXNoX2luZGlzX1VWOnVuZGVmaW5lZCxjdHJfdHJ1bmNhdGlvbl9leHA6dHJ1bmNhdGlvbl8xNTAsZG1wX2FnZV9leHA6dW5kZWZpbmVkLGNvbGRfYm9vdF9leHA6ZGVmYXVsdCxwbGF0Zm9ybTpkZWZhdWx0oAEAqAEAsgEgsKUaYcX+XTV3eWZWWHv6caz4hEzSXGMbD0D2hG1jnrK6ASlodHRwczovL2dhbWUuYmlsaWJpbGkuY29tL2luZGllZ2FtZS9mYi1oNcIBANIBANgBAeABAOgBAPABAPgBAIACAIgCALgCAMACAMgCANACANgCAOoCAPACie0D+ALmAagDAA==","client_ip":"36.157.178.181","server_type":1,"resource_id":631,"index":2,"cm_mark":1,"extra":{"use_ad_web_v2":false,"show_urls":[],"click_urls":[],"download_whitelist":[],"open_whitelist":[],"card":{"card_type":0,"title":"","covers":[{"url":"https://i0.hdslb.com/bfs/sycp/creative_img/201907/6661b7498c233b33c3bea90a0e87a21d.jpg","loop":0}],"jump_url":"https://game.bilibili.com/indiegame/fb-h5","desc":"","callup_url":"","long_desc":"","ad_tag":"","extra_desc":"","ad_tag_style":{"type":2,"text":"广告","text_color":"#999999FF","bg_border_color":"#999999FF"},"feedback_panel":{"panel_type_text":"广告","feedback_panel_detail":[]}},"report_time":2000,"sales_type":31,"special_industry":false,"special_industry_tips":"","preload_landingpage":0,"share_info":{}}},{"id":0,"title":"","image":"https://i0.hdslb.com/bfs/sycp/creative_img/201907/3d6d43833a59b44b7ed1fade8420412e.jpg","hash":"4b7010ed8ca4750a31a068cb2ae0d621","uri":"bilibili://game_center/detail?id=102057&sourceFrom=782&sourceType=adPut","request_id":"1564654717451q172a22a48a149q14459","creative_id":259379263577444352,"src_id":704,"is_ad":true,"is_ad_loc":true,"ad_cb":"CAAQABiAoIudjoLgzAMgACgAMCQ4wAVCITE1NjQ2NTQ3MTc0NTFxMTcyYTIyYTQ4YTE0OXExNDQ1OUiLlMHlxC1SBuWohOW6lVoG5rmW5Y2XYgbkuK3lm71oAXAAeICAgIAQgAEAiAHyQJIBDjM2LjE1Ny4xNzguMTgxmgG5BGFsbDpjcGNfY3Jvd2RfdGFyZ2V0LGVjcG06ZGVmYXVsdCxjcGNUYWdGaWx0ZXI6dW5kZWZpbmVkLGVuaGFuY2VDdHJRRmFjdG9yOnNxdWFyZSxwbGF5cGFnZWN0cjplbmFibGVfY29uc3RhbnQsdXBfcmVjX2Zsb3dfY29udHJvbDp1bmRlZmluZWQsYnJ1c2hfZHVwbGljYXRlOmRlZmF1bHQscGN0cl9jcG06Y3BtLHBjdHJfdjI6bHJfY29uc3RhbnQsZHluYW1pY19mbG93X2NvbnRyb2w6c3BsaXQgdGhlIGZsb3cgYnkgbWlkLHBjdnI6ZGxkLGZyZXFMaW1pdDpkZWZhdWx0LHNtYWxsQ29uc3VtZVVuaXQ6ZGVmYXVsdCxvdXRlckJlYXRJbm5lcjpkZWZhdWx0LG91dGVyUXVpdDpkZWZhdWx0LGZkc19ydHQ6OCxjcGE6Y3BhXzMwZCxpbmRpc19VVjp1bmRlZmluZWQsaGFzaF9pbmRpc19VVjp1bmRlZmluZWQsZmVlZHNfcmFuZG9tX3Jlc3VsdDpkZWZhdWx0LGZsb3dfcmF0aW9fY2hlY2s6cjMsYmFzZV9oYXNoX2luZGlzX1VWOnVuZGVmaW5lZCxjdHJfdHJ1bmNhdGlvbl9leHA6dHJ1bmNhdGlvbl8xNTAsZG1wX2FnZV9leHA6dW5kZWZpbmVkLGNvbGRfYm9vdF9leHA6ZGVmYXVsdCxwbGF0Zm9ybTpkZWZhdWx0oAEAqAEAsgEgOH58cHYj+YY7oRcqen/JaskRYtS52etTy0E6n5U3tqy6AUdiaWxpYmlsaTovL2dhbWVfY2VudGVyL2RldGFpbD9pZD0xMDIwNTcmc291cmNlRnJvbT03ODImc291cmNlVHlwZT1hZFB1dMIBANIBANgBAeABAOgBAPABAPgBAIACAIgCALgCAMACAMgCANACANgCAOoCAPACve0D+ALmAagDAA==","click_url":"https://ad-bili-data.biligame.com/api/mobile/clickBili?ad_plan_id=36594&mid=__MID__&os=0&idfa=__IDFA__&buvid=__BUVID__&android_id=__ANDROIDID__&imei=__IMEI__&mac=__MAC__&duid=__DUID__&ip=36.157.178.181&request_id=1564654717451q172a22a48a149q14459&ts=__TS__&ua=__UA__","client_ip":"36.157.178.181","server_type":1,"resource_id":631,"index":3,"cm_mark":1,"extra":{"use_ad_web_v2":false,"show_urls":[],"click_urls":["https://ad-bili-data.biligame.com/api/mobile/clickBili?ad_plan_id=36594&mid=__MID__&os=0&idfa=__IDFA__&buvid=__BUVID__&android_id=__ANDROIDID__&imei=__IMEI__&mac=__MAC__&duid=__DUID__&ip=36.157.178.181&request_id=1564654717451q172a22a48a149q14459&ts=__TS__&ua=__UA__"],"download_whitelist":[],"open_whitelist":[],"card":{"card_type":0,"title":"","covers":[{"url":"https://i0.hdslb.com/bfs/sycp/creative_img/201907/3d6d43833a59b44b7ed1fade8420412e.jpg","loop":0}],"jump_url":"bilibili://game_center/detail?id=102057&sourceFrom=782&sourceType=adPut","desc":"","callup_url":"","long_desc":"","ad_tag":"","extra_desc":"","ad_tag_style":{"type":2,"text":"广告","text_color":"#999999FF","bg_border_color":"#999999FF"},"feedback_panel":{"panel_type_text":"广告","feedback_panel_detail":[]}},"report_time":2000,"sales_type":31,"special_industry":false,"special_industry_tips":"","preload_landingpage":0,"share_info":{}}},{"id":332363,"title":"李宇春音乐创作历程大公开","image":"http://i0.hdslb.com/bfs/archive/217f10fefc72a7132bce70c2d5967a08e1807262.png","hash":"0d544791be7a546be671773b1a3f0fb1","uri":"https://www.bilibili.com/blackboard/topic/activity-fmRYzMG7U.html","request_id":"1564654717451q172a22a48a149q14459","src_id":705,"is_ad_loc":true,"client_ip":"36.157.178.181","server_type":0,"resource_id":631,"index":4,"cm_mark":0},{"id":332354,"title":"乘着浪潮前进","image":"http://i0.hdslb.com/bfs/archive/214e7483f3c962cb6f598a72764714a993947f76.jpg","hash":"89c8d6fed96c95e64cdc080e15ef885b","uri":"https://www.bilibili.com/read/cv3117784","request_id":"1564654717451q172a22a48a149q14459","src_id":1654,"is_ad_loc":true,"client_ip":"36.157.178.181","server_type":0,"resource_id":631,"index":5,"cm_mark":0}]
             * goto : live
             * param : 15081
             * cover : http://i0.hdslb.com/bfs/live/f0971acb01e533e941fd2c739c6f637a1862b035.jpg
             * title : 【CSGO】白给狐狸
             * uri : https://live.bilibili.com/15081?broadcast_type=0
             * three_point : {"dislike_reasons":[{"id":4,"name":"UP主:唧唧歪歪丶萌"},{"id":2,"name":"分区:CS:GO"},{"id":1,"name":"不感兴趣"}]}
             * player_args : {"is_live":1,"room_id":15081,"type":"live"}
             * three_point_v2 : [{"title":"不感兴趣","subtitle":"(选择后将减少相似内容推荐)","reasons":[{"id":4,"name":"UP主:唧唧歪歪丶萌"},{"id":2,"name":"分区:CS:GO"},{"id":1,"name":"不感兴趣"}],"type":"dislike"}]
             * cover_left_text_1 : 443
             * cover_left_icon_1 : 2
             * cover_right_text : 唧唧歪歪丶萌
             * badge : 直播
             * rcmd_reason : 已关注
             * official_icon : 16
             * can_play : 1
             * rcmd_reason_style : {"text":"已关注","text_color":"#FFFFFFFF","bg_color":"#FFFB9E60","border_color":"#FFFB9E60","bg_style":1}
             * cover_left_text_2 : 25
             * cover_left_icon_2 : 3
             * desc_button : {"text":"手机游戏 · 攻略","uri":"bilibili://pegasus/channel/2100","event":"channel_click","type":1,"event_v2":"channel"}
             * ad_info : {"creative_id":21565291,"creative_type":2,"card_type":3,"creative_content":{"title":"献给热爱FGO的你","description":"招商银行","image_url":"https://i0.hdslb.com/bfs/sycp/creative_img/201907/bf8d098b3943940fbbe7a229c0bf92bb.jpg_640x400.jpg","image_md5":"62f3751949063f94908a681c71b73e8c","url":"https://cm.bilibili.com/cm/api/fees/wise/redirect?ad_cb=COjNBhDA9RgY656kCiAyKAEw0DA46w5CITE1NjQ2NTQ3MTczODhxMTcyYTIyYTYwYTIzNnExNTY0MUjMk8HlxC1SBuWohOW6lVoG5rmW5Y2XYgbkuK3lm71oAXAAeICAgIDgBIABA4gBAJIBDjM2LjE1Ny4xNzguMTgxmgGwBGFsbDpkZWZhdWx0LGVjcG06ZGVmYXVsdCxjcGNUYWdGaWx0ZXI6dW5kZWZpbmVkLGVuaGFuY2VDdHJRRmFjdG9yOnNxdWFyZSxwbGF5cGFnZWN0cjplbmFibGVfY29uc3RhbnQsdXBfcmVjX2Zsb3dfY29udHJvbDp1bmRlZmluZWQsYnJ1c2hfZHVwbGljYXRlOmRlZmF1bHQscGN0cl9jcG06Y3BtLHBjdHJfdjI6bHJfY29uc3RhbnQsZHluYW1pY19mbG93X2NvbnRyb2w6c3BsaXQgdGhlIGZsb3cgYnkgbWlkLHBjdnI6ZGxkLGZyZXFMaW1pdDpkZWZhdWx0LHNtYWxsQ29uc3VtZVVuaXQ6ZGVmYXVsdCxvdXRlckJlYXRJbm5lcjpkZWZhdWx0LG91dGVyUXVpdDpkZWZhdWx0LGZkc19ydHQ6OCxjcGE6Y3BhXzMwZCxpbmRpc19VVjp1bmRlZmluZWQsaGFzaF9pbmRpc19VVjp1bmRlZmluZWQsZmVlZHNfcmFuZG9tX3Jlc3VsdDpkZWZhdWx0LGZsb3dfcmF0aW9fY2hlY2s6cjMsYmFzZV9oYXNoX2luZGlzX1VWOnVuZGVmaW5lZCxjdHJfdHJ1bmNhdGlvbl9leHA6dHJ1bmNhdGlvbl8xNTAsZG1wX2FnZV9leHA6dW5kZWZpbmVkLGNvbGRfYm9vdF9leHA6ZGVmYXVsdCxwbGF0Zm9ybTpkZWZhdWx0oAEyqAEtsgEgkDuw0OrDHgDt6D6Tg9G2PUuOCJy0p%2F%2BxxNcqVhORml26AWlodHRwczovL3Jlcy5jYy5jbWJpbWcuY29tL2l0YWZyb250L0Zyb2cvaW5kZXguaHRtbCMvbG9naW4vYXBpc2NmZ28vcmVtb3RlP3dlYkFkZHJlc3M9TjM3MDBNTTIwOTE0MTk5MDAwYmnCAaEBMjk1MF8xMjYyXzc0OF83MDJfNjQyXzU1OF81MTBfNDE4XzQxOF80MTJfNDEyXzQxMl80MDhfNDA4XzQwOF8zOThfMzk4XzM0OV8zNDlfMzQ5XzM0OV8zNDlfMzQ5XzMzOF8zMzhfMzM4XzMzOF8zMzhfMzM4XzMzM18zMjlfMzI5XzMyOV8zMjlfMzI5XzI5M18yOTNfMTUwXzE1MF8xMTPSAQDYASbgAcCaDOgBwJoM8AEA%2BAEygAICiAIAkgLnAjQxOTU4N18xNTY0NjQ4MTAwLDQxMzI1Ml8xNTY0NjQ4MTA5LDM3ODQxOV8xNTY0NjQ4MTE1LDQwNjAxN18xNTY0NjQ4MTUyLDM0NTQ2M18xNTY0NjQ4NDAxLDQxNDcyM18xNTY0NjQ4NDA5LDQwOTQwM18xNTY0NjQ4NDM1LDQxNTU5NF8xNTY0NjQ4NDUyLDQxNzMzNF8xNTY0NjQ4NDU2LDQxMDI2NV8xNTY0NjQ4NDYwLDQxMTAxOV8xNTY0NjQ4NDY0LDQxNDcyM18xNTY0NjQ4NDY4LDM1NTU0OF8xNTY0NjQ4NDcxLDQwOTQwM18xNTY0NjQ4NDg0LDQwNjE1N18xNTY0NjQ4NTA4LDQxOTY3N18xNTY0NjQ4NjIwLDQwNTk5MF8xNTY0NjQ4NjQ3LDM3ODQxOV8xNTY0NjQ5MzQ4LDQxODY1Ml8xNTY0NjQ5MzQ4LDQxODY3MV8xNTY0NjQ5Mzk0mAKpnCagArcZqAK%2B6ROwAo8NuAIAwAIAyAIA0AIA2AIA6gIA8AIA%2BAIAqAMA"},"ad_cb":"COjNBhDA9RgY656kCiAyKAEw0DA46w5CITE1NjQ2NTQ3MTczODhxMTcyYTIyYTYwYTIzNnExNTY0MUjMk8HlxC1SBuWohOW6lVoG5rmW5Y2XYgbkuK3lm71oAXAAeICAgIDgBIABA4gBAJIBDjM2LjE1Ny4xNzguMTgxmgGwBGFsbDpkZWZhdWx0LGVjcG06ZGVmYXVsdCxjcGNUYWdGaWx0ZXI6dW5kZWZpbmVkLGVuaGFuY2VDdHJRRmFjdG9yOnNxdWFyZSxwbGF5cGFnZWN0cjplbmFibGVfY29uc3RhbnQsdXBfcmVjX2Zsb3dfY29udHJvbDp1bmRlZmluZWQsYnJ1c2hfZHVwbGljYXRlOmRlZmF1bHQscGN0cl9jcG06Y3BtLHBjdHJfdjI6bHJfY29uc3RhbnQsZHluYW1pY19mbG93X2NvbnRyb2w6c3BsaXQgdGhlIGZsb3cgYnkgbWlkLHBjdnI6ZGxkLGZyZXFMaW1pdDpkZWZhdWx0LHNtYWxsQ29uc3VtZVVuaXQ6ZGVmYXVsdCxvdXRlckJlYXRJbm5lcjpkZWZhdWx0LG91dGVyUXVpdDpkZWZhdWx0LGZkc19ydHQ6OCxjcGE6Y3BhXzMwZCxpbmRpc19VVjp1bmRlZmluZWQsaGFzaF9pbmRpc19VVjp1bmRlZmluZWQsZmVlZHNfcmFuZG9tX3Jlc3VsdDpkZWZhdWx0LGZsb3dfcmF0aW9fY2hlY2s6cjMsYmFzZV9oYXNoX2luZGlzX1VWOnVuZGVmaW5lZCxjdHJfdHJ1bmNhdGlvbl9leHA6dHJ1bmNhdGlvbl8xNTAsZG1wX2FnZV9leHA6dW5kZWZpbmVkLGNvbGRfYm9vdF9leHA6ZGVmYXVsdCxwbGF0Zm9ybTpkZWZhdWx0oAEyqAEtsgEgkDuw0OrDHgDt6D6Tg9G2PUuOCJy0p/+xxNcqVhORml26AWlodHRwczovL3Jlcy5jYy5jbWJpbWcuY29tL2l0YWZyb250L0Zyb2cvaW5kZXguaHRtbCMvbG9naW4vYXBpc2NmZ28vcmVtb3RlP3dlYkFkZHJlc3M9TjM3MDBNTTIwOTE0MTk5MDAwYmnCAaEBMjk1MF8xMjYyXzc0OF83MDJfNjQyXzU1OF81MTBfNDE4XzQxOF80MTJfNDEyXzQxMl80MDhfNDA4XzQwOF8zOThfMzk4XzM0OV8zNDlfMzQ5XzM0OV8zNDlfMzQ5XzMzOF8zMzhfMzM4XzMzOF8zMzhfMzM4XzMzM18zMjlfMzI5XzMyOV8zMjlfMzI5XzI5M18yOTNfMTUwXzE1MF8xMTPSAQDYASbgAcCaDOgBwJoM8AEA+AEygAICiAIAkgLnAjQxOTU4N18xNTY0NjQ4MTAwLDQxMzI1Ml8xNTY0NjQ4MTA5LDM3ODQxOV8xNTY0NjQ4MTE1LDQwNjAxN18xNTY0NjQ4MTUyLDM0NTQ2M18xNTY0NjQ4NDAxLDQxNDcyM18xNTY0NjQ4NDA5LDQwOTQwM18xNTY0NjQ4NDM1LDQxNTU5NF8xNTY0NjQ4NDUyLDQxNzMzNF8xNTY0NjQ4NDU2LDQxMDI2NV8xNTY0NjQ4NDYwLDQxMTAxOV8xNTY0NjQ4NDY0LDQxNDcyM18xNTY0NjQ4NDY4LDM1NTU0OF8xNTY0NjQ4NDcxLDQwOTQwM18xNTY0NjQ4NDg0LDQwNjE1N18xNTY0NjQ4NTA4LDQxOTY3N18xNTY0NjQ4NjIwLDQwNTk5MF8xNTY0NjQ4NjQ3LDM3ODQxOV8xNTY0NjQ5MzQ4LDQxODY1Ml8xNTY0NjQ5MzQ4LDQxODY3MV8xNTY0NjQ5Mzk0mAKpnCagArcZqAK+6ROwAo8NuAIAwAIAyAIA0AIA2AIA6gIA8AIA+AIAqAMA","resource":1897,"source":1899,"request_id":"1564654717388q172a22a60a236q15641","is_ad":true,"cm_mark":1,"index":2,"is_ad_loc":true,"card_index":5,"client_ip":"36.157.178.181","extra":{"use_ad_web_v2":true,"show_urls":[],"click_urls":[],"download_whitelist":[],"open_whitelist":[],"card":{"card_type":3,"title":"献给热爱FGO的你","covers":[{"url":"https://i0.hdslb.com/bfs/sycp/creative_img/201907/bf8d098b3943940fbbe7a229c0bf92bb.jpg_640x400.jpg","loop":0}],"jump_url":"https://cm.bilibili.com/cm/api/fees/wise/redirect?ad_cb=COjNBhDA9RgY656kCiAyKAEw0DA46w5CITE1NjQ2NTQ3MTczODhxMTcyYTIyYTYwYTIzNnExNTY0MUjMk8HlxC1SBuWohOW6lVoG5rmW5Y2XYgbkuK3lm71oAXAAeICAgIDgBIABA4gBAJIBDjM2LjE1Ny4xNzguMTgxmgGwBGFsbDpkZWZhdWx0LGVjcG06ZGVmYXVsdCxjcGNUYWdGaWx0ZXI6dW5kZWZpbmVkLGVuaGFuY2VDdHJRRmFjdG9yOnNxdWFyZSxwbGF5cGFnZWN0cjplbmFibGVfY29uc3RhbnQsdXBfcmVjX2Zsb3dfY29udHJvbDp1bmRlZmluZWQsYnJ1c2hfZHVwbGljYXRlOmRlZmF1bHQscGN0cl9jcG06Y3BtLHBjdHJfdjI6bHJfY29uc3RhbnQsZHluYW1pY19mbG93X2NvbnRyb2w6c3BsaXQgdGhlIGZsb3cgYnkgbWlkLHBjdnI6ZGxkLGZyZXFMaW1pdDpkZWZhdWx0LHNtYWxsQ29uc3VtZVVuaXQ6ZGVmYXVsdCxvdXRlckJlYXRJbm5lcjpkZWZhdWx0LG91dGVyUXVpdDpkZWZhdWx0LGZkc19ydHQ6OCxjcGE6Y3BhXzMwZCxpbmRpc19VVjp1bmRlZmluZWQsaGFzaF9pbmRpc19VVjp1bmRlZmluZWQsZmVlZHNfcmFuZG9tX3Jlc3VsdDpkZWZhdWx0LGZsb3dfcmF0aW9fY2hlY2s6cjMsYmFzZV9oYXNoX2luZGlzX1VWOnVuZGVmaW5lZCxjdHJfdHJ1bmNhdGlvbl9leHA6dHJ1bmNhdGlvbl8xNTAsZG1wX2FnZV9leHA6dW5kZWZpbmVkLGNvbGRfYm9vdF9leHA6ZGVmYXVsdCxwbGF0Zm9ybTpkZWZhdWx0oAEyqAEtsgEgkDuw0OrDHgDt6D6Tg9G2PUuOCJy0p%2F%2BxxNcqVhORml26AWlodHRwczovL3Jlcy5jYy5jbWJpbWcuY29tL2l0YWZyb250L0Zyb2cvaW5kZXguaHRtbCMvbG9naW4vYXBpc2NmZ28vcmVtb3RlP3dlYkFkZHJlc3M9TjM3MDBNTTIwOTE0MTk5MDAwYmnCAaEBMjk1MF8xMjYyXzc0OF83MDJfNjQyXzU1OF81MTBfNDE4XzQxOF80MTJfNDEyXzQxMl80MDhfNDA4XzQwOF8zOThfMzk4XzM0OV8zNDlfMzQ5XzM0OV8zNDlfMzQ5XzMzOF8zMzhfMzM4XzMzOF8zMzhfMzM4XzMzM18zMjlfMzI5XzMyOV8zMjlfMzI5XzI5M18yOTNfMTUwXzE1MF8xMTPSAQDYASbgAcCaDOgBwJoM8AEA%2BAEygAICiAIAkgLnAjQxOTU4N18xNTY0NjQ4MTAwLDQxMzI1Ml8xNTY0NjQ4MTA5LDM3ODQxOV8xNTY0NjQ4MTE1LDQwNjAxN18xNTY0NjQ4MTUyLDM0NTQ2M18xNTY0NjQ4NDAxLDQxNDcyM18xNTY0NjQ4NDA5LDQwOTQwM18xNTY0NjQ4NDM1LDQxNTU5NF8xNTY0NjQ4NDUyLDQxNzMzNF8xNTY0NjQ4NDU2LDQxMDI2NV8xNTY0NjQ4NDYwLDQxMTAxOV8xNTY0NjQ4NDY0LDQxNDcyM18xNTY0NjQ4NDY4LDM1NTU0OF8xNTY0NjQ4NDcxLDQwOTQwM18xNTY0NjQ4NDg0LDQwNjE1N18xNTY0NjQ4NTA4LDQxOTY3N18xNTY0NjQ4NjIwLDQwNTk5MF8xNTY0NjQ4NjQ3LDM3ODQxOV8xNTY0NjQ5MzQ4LDQxODY1Ml8xNTY0NjQ5MzQ4LDQxODY3MV8xNTY0NjQ5Mzk0mAKpnCagArcZqAK%2B6ROwAo8NuAIAwAIAyAIA0AIA2AIA6gIA8AIA%2BAIAqAMA","desc":"招商银行","callup_url":"","long_desc":"","ad_tag":"","extra_desc":"","ad_tag_style":{"type":2,"text":"广告","text_color":"#999999FF","bg_border_color":"#999999FF"},"feedback_panel":{"panel_type_text":"广告","feedback_panel_detail":[{"text":"我不想看到这个广告","module_id":1,"jump_type":1,"icon_url":"https://i0.hdslb.com/bfs/sycp/mng/201907/a53df8f189bb12666a39d10ad1babcf5.png","jump_url":"","secondary_panel":[{"text":"不感兴趣","reason_id":1},{"text":"相似内容过多","reason_id":2},{"text":"广告质量差","reason_id":5}]},{"text":"举报","module_id":2,"jump_type":2,"icon_url":"https://i0.hdslb.com/bfs/sycp/mng/201907/2bc344ad3510da5cfdc7c7714abaeda4.png","jump_url":"http://cm.bilibili.com/ldad/light/ad-complain.html","secondary_panel":[]},{"text":"我为什么会看到此广告","module_id":3,"jump_type":2,"icon_url":"https://i0.hdslb.com/bfs/sycp/mng/201907/82480c4ef205c9b715d6e2ea7f5c4041.png","jump_url":"http://cm.bilibili.com/ldad/light/ad-introduce.html","secondary_panel":[]}]}},"report_time":2000,"sales_type":12,"special_industry":false,"special_industry_tips":"","preload_landingpage":0,"enable_download_dialog":false,"share_info":{}}}
             */

            private String card_type;
            private String card_goto;
            private ArgsBean args;
            private int idx;
            private String hash;
            @SerializedName("goto")
            private String gotoX;
            private String param;
            private String cover;
            private String title;
            private String uri;
            private ThreePointBean three_point;
            private PlayerArgsBean player_args;
            private String cover_left_text_1;
            private int cover_left_icon_1;
            private String cover_right_text;
            private String badge;
            private String rcmd_reason;
            private int official_icon;
            private int can_play;
            private RcmdReasonStyleBean rcmd_reason_style;
            private String cover_left_text_2;
            private int cover_left_icon_2;
            private DescButtonBean desc_button;
            private AdInfoBean ad_info;
            private List<BannerItemBean> banner_item;
            private List<ThreePointV2Bean> three_point_v2;

            public String getCard_type() {
                return card_type;
            }

            public void setCard_type(String card_type) {
                this.card_type = card_type;
            }

            public String getCard_goto() {
                return card_goto;
            }

            public void setCard_goto(String card_goto) {
                this.card_goto = card_goto;
            }

            public ArgsBean getArgs() {
                return args;
            }

            public void setArgs(ArgsBean args) {
                this.args = args;
            }

            public int getIdx() {
                return idx;
            }

            public void setIdx(int idx) {
                this.idx = idx;
            }

            public String getHash() {
                return hash;
            }

            public void setHash(String hash) {
                this.hash = hash;
            }

            public String getGotoX() {
                return gotoX;
            }

            public void setGotoX(String gotoX) {
                this.gotoX = gotoX;
            }

            public String getParam() {
                return param;
            }

            public void setParam(String param) {
                this.param = param;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getUri() {
                return uri;
            }

            public void setUri(String uri) {
                this.uri = uri;
            }

            public ThreePointBean getThree_point() {
                return three_point;
            }

            public void setThree_point(ThreePointBean three_point) {
                this.three_point = three_point;
            }

            public PlayerArgsBean getPlayer_args() {
                return player_args;
            }

            public void setPlayer_args(PlayerArgsBean player_args) {
                this.player_args = player_args;
            }

            public String getCover_left_text_1() {
                return cover_left_text_1;
            }

            public void setCover_left_text_1(String cover_left_text_1) {
                this.cover_left_text_1 = cover_left_text_1;
            }

            public int getCover_left_icon_1() {
                return cover_left_icon_1;
            }

            public void setCover_left_icon_1(int cover_left_icon_1) {
                this.cover_left_icon_1 = cover_left_icon_1;
            }

            public String getCover_right_text() {
                return cover_right_text;
            }

            public void setCover_right_text(String cover_right_text) {
                this.cover_right_text = cover_right_text;
            }

            public String getBadge() {
                return badge;
            }

            public void setBadge(String badge) {
                this.badge = badge;
            }

            public String getRcmd_reason() {
                return rcmd_reason;
            }

            public void setRcmd_reason(String rcmd_reason) {
                this.rcmd_reason = rcmd_reason;
            }

            public int getOfficial_icon() {
                return official_icon;
            }

            public void setOfficial_icon(int official_icon) {
                this.official_icon = official_icon;
            }

            public int getCan_play() {
                return can_play;
            }

            public void setCan_play(int can_play) {
                this.can_play = can_play;
            }

            public RcmdReasonStyleBean getRcmd_reason_style() {
                return rcmd_reason_style;
            }

            public void setRcmd_reason_style(RcmdReasonStyleBean rcmd_reason_style) {
                this.rcmd_reason_style = rcmd_reason_style;
            }

            public String getCover_left_text_2() {
                return cover_left_text_2;
            }

            public void setCover_left_text_2(String cover_left_text_2) {
                this.cover_left_text_2 = cover_left_text_2;
            }

            public int getCover_left_icon_2() {
                return cover_left_icon_2;
            }

            public void setCover_left_icon_2(int cover_left_icon_2) {
                this.cover_left_icon_2 = cover_left_icon_2;
            }

            public DescButtonBean getDesc_button() {
                return desc_button;
            }

            public void setDesc_button(DescButtonBean desc_button) {
                this.desc_button = desc_button;
            }

            public AdInfoBean getAd_info() {
                return ad_info;
            }

            public void setAd_info(AdInfoBean ad_info) {
                this.ad_info = ad_info;
            }

            public List<BannerItemBean> getBanner_item() {
                return banner_item;
            }

            public void setBanner_item(List<BannerItemBean> banner_item) {
                this.banner_item = banner_item;
            }

            public List<ThreePointV2Bean> getThree_point_v2() {
                return three_point_v2;
            }

            public void setThree_point_v2(List<ThreePointV2Bean> three_point_v2) {
                this.three_point_v2 = three_point_v2;
            }

            public static class ArgsBean {
               /* "up_id":4397552,
                        "up_name":"猫猫村长",
                        "rid":21,
                        "rname":"日常",
                        "tid":313497,
                        "tname":"垃圾分类",
                        "aid":59554859*/
               int up_id;
               String up_name;
               int rid;
               String rname;
               int tid;
               String tname;
               int aid;

                public int getUp_id() {
                    return up_id;
                }

                public void setUp_id(int up_id) {
                    this.up_id = up_id;
                }

                public String getUp_name() {
                    return up_name;
                }

                public void setUp_name(String up_name) {
                    this.up_name = up_name;
                }

                public int getRid() {
                    return rid;
                }

                public void setRid(int rid) {
                    this.rid = rid;
                }

                public String getRname() {
                    return rname;
                }

                public void setRname(String rname) {
                    this.rname = rname;
                }

                public int getTid() {
                    return tid;
                }

                public void setTid(int tid) {
                    this.tid = tid;
                }

                public String getTname() {
                    return tname;
                }

                public void setTname(String tname) {
                    this.tname = tname;
                }

                public int getAid() {
                    return aid;
                }

                public void setAid(int aid) {
                    this.aid = aid;
                }
            }

            public static class ThreePointBean {
                private List<DislikeReasonsBean> dislike_reasons;

                public List<DislikeReasonsBean> getDislike_reasons() {
                    return dislike_reasons;
                }

                public void setDislike_reasons(List<DislikeReasonsBean> dislike_reasons) {
                    this.dislike_reasons = dislike_reasons;
                }

                public static class DislikeReasonsBean {
                    /**
                     * id : 4
                     * name : UP主:唧唧歪歪丶萌
                     */

                    private int id;
                    private String name;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }
                }
            }

            public static class PlayerArgsBean {
                /**
                 * is_live : 1
                 * room_id : 15081
                 * type : live
                 */

                private int is_live;
                private int room_id;
                private String type;

                public int getIs_live() {
                    return is_live;
                }

                public void setIs_live(int is_live) {
                    this.is_live = is_live;
                }

                public int getRoom_id() {
                    return room_id;
                }

                public void setRoom_id(int room_id) {
                    this.room_id = room_id;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }
            }

            public static class RcmdReasonStyleBean {
                /**
                 * text : 已关注
                 * text_color : #FFFFFFFF
                 * bg_color : #FFFB9E60
                 * border_color : #FFFB9E60
                 * bg_style : 1
                 */

                private String text;
                private String text_color;
                private String bg_color;
                private String border_color;
                private int bg_style;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public String getText_color() {
                    return text_color;
                }

                public void setText_color(String text_color) {
                    this.text_color = text_color;
                }

                public String getBg_color() {
                    return bg_color;
                }

                public void setBg_color(String bg_color) {
                    this.bg_color = bg_color;
                }

                public String getBorder_color() {
                    return border_color;
                }

                public void setBorder_color(String border_color) {
                    this.border_color = border_color;
                }

                public int getBg_style() {
                    return bg_style;
                }

                public void setBg_style(int bg_style) {
                    this.bg_style = bg_style;
                }
            }

            public static class DescButtonBean {
                /**
                 * text : 手机游戏 · 攻略
                 * uri : bilibili://pegasus/channel/2100
                 * event : channel_click
                 * type : 1
                 * event_v2 : channel
                 */

                private String text;
                private String uri;
                private String event;
                private int type;
                private String event_v2;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public String getEvent() {
                    return event;
                }

                public void setEvent(String event) {
                    this.event = event;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getEvent_v2() {
                    return event_v2;
                }

                public void setEvent_v2(String event_v2) {
                    this.event_v2 = event_v2;
                }
            }

            public static class AdInfoBean {
                /**
                 * creative_id : 21565291
                 * creative_type : 2
                 * card_type : 3
                 * creative_content : {"title":"献给热爱FGO的你","description":"招商银行","image_url":"https://i0.hdslb.com/bfs/sycp/creative_img/201907/bf8d098b3943940fbbe7a229c0bf92bb.jpg_640x400.jpg","image_md5":"62f3751949063f94908a681c71b73e8c","url":"https://cm.bilibili.com/cm/api/fees/wise/redirect?ad_cb=COjNBhDA9RgY656kCiAyKAEw0DA46w5CITE1NjQ2NTQ3MTczODhxMTcyYTIyYTYwYTIzNnExNTY0MUjMk8HlxC1SBuWohOW6lVoG5rmW5Y2XYgbkuK3lm71oAXAAeICAgIDgBIABA4gBAJIBDjM2LjE1Ny4xNzguMTgxmgGwBGFsbDpkZWZhdWx0LGVjcG06ZGVmYXVsdCxjcGNUYWdGaWx0ZXI6dW5kZWZpbmVkLGVuaGFuY2VDdHJRRmFjdG9yOnNxdWFyZSxwbGF5cGFnZWN0cjplbmFibGVfY29uc3RhbnQsdXBfcmVjX2Zsb3dfY29udHJvbDp1bmRlZmluZWQsYnJ1c2hfZHVwbGljYXRlOmRlZmF1bHQscGN0cl9jcG06Y3BtLHBjdHJfdjI6bHJfY29uc3RhbnQsZHluYW1pY19mbG93X2NvbnRyb2w6c3BsaXQgdGhlIGZsb3cgYnkgbWlkLHBjdnI6ZGxkLGZyZXFMaW1pdDpkZWZhdWx0LHNtYWxsQ29uc3VtZVVuaXQ6ZGVmYXVsdCxvdXRlckJlYXRJbm5lcjpkZWZhdWx0LG91dGVyUXVpdDpkZWZhdWx0LGZkc19ydHQ6OCxjcGE6Y3BhXzMwZCxpbmRpc19VVjp1bmRlZmluZWQsaGFzaF9pbmRpc19VVjp1bmRlZmluZWQsZmVlZHNfcmFuZG9tX3Jlc3VsdDpkZWZhdWx0LGZsb3dfcmF0aW9fY2hlY2s6cjMsYmFzZV9oYXNoX2luZGlzX1VWOnVuZGVmaW5lZCxjdHJfdHJ1bmNhdGlvbl9leHA6dHJ1bmNhdGlvbl8xNTAsZG1wX2FnZV9leHA6dW5kZWZpbmVkLGNvbGRfYm9vdF9leHA6ZGVmYXVsdCxwbGF0Zm9ybTpkZWZhdWx0oAEyqAEtsgEgkDuw0OrDHgDt6D6Tg9G2PUuOCJy0p%2F%2BxxNcqVhORml26AWlodHRwczovL3Jlcy5jYy5jbWJpbWcuY29tL2l0YWZyb250L0Zyb2cvaW5kZXguaHRtbCMvbG9naW4vYXBpc2NmZ28vcmVtb3RlP3dlYkFkZHJlc3M9TjM3MDBNTTIwOTE0MTk5MDAwYmnCAaEBMjk1MF8xMjYyXzc0OF83MDJfNjQyXzU1OF81MTBfNDE4XzQxOF80MTJfNDEyXzQxMl80MDhfNDA4XzQwOF8zOThfMzk4XzM0OV8zNDlfMzQ5XzM0OV8zNDlfMzQ5XzMzOF8zMzhfMzM4XzMzOF8zMzhfMzM4XzMzM18zMjlfMzI5XzMyOV8zMjlfMzI5XzI5M18yOTNfMTUwXzE1MF8xMTPSAQDYASbgAcCaDOgBwJoM8AEA%2BAEygAICiAIAkgLnAjQxOTU4N18xNTY0NjQ4MTAwLDQxMzI1Ml8xNTY0NjQ4MTA5LDM3ODQxOV8xNTY0NjQ4MTE1LDQwNjAxN18xNTY0NjQ4MTUyLDM0NTQ2M18xNTY0NjQ4NDAxLDQxNDcyM18xNTY0NjQ4NDA5LDQwOTQwM18xNTY0NjQ4NDM1LDQxNTU5NF8xNTY0NjQ4NDUyLDQxNzMzNF8xNTY0NjQ4NDU2LDQxMDI2NV8xNTY0NjQ4NDYwLDQxMTAxOV8xNTY0NjQ4NDY0LDQxNDcyM18xNTY0NjQ4NDY4LDM1NTU0OF8xNTY0NjQ4NDcxLDQwOTQwM18xNTY0NjQ4NDg0LDQwNjE1N18xNTY0NjQ4NTA4LDQxOTY3N18xNTY0NjQ4NjIwLDQwNTk5MF8xNTY0NjQ4NjQ3LDM3ODQxOV8xNTY0NjQ5MzQ4LDQxODY1Ml8xNTY0NjQ5MzQ4LDQxODY3MV8xNTY0NjQ5Mzk0mAKpnCagArcZqAK%2B6ROwAo8NuAIAwAIAyAIA0AIA2AIA6gIA8AIA%2BAIAqAMA"}
                 * ad_cb : COjNBhDA9RgY656kCiAyKAEw0DA46w5CITE1NjQ2NTQ3MTczODhxMTcyYTIyYTYwYTIzNnExNTY0MUjMk8HlxC1SBuWohOW6lVoG5rmW5Y2XYgbkuK3lm71oAXAAeICAgIDgBIABA4gBAJIBDjM2LjE1Ny4xNzguMTgxmgGwBGFsbDpkZWZhdWx0LGVjcG06ZGVmYXVsdCxjcGNUYWdGaWx0ZXI6dW5kZWZpbmVkLGVuaGFuY2VDdHJRRmFjdG9yOnNxdWFyZSxwbGF5cGFnZWN0cjplbmFibGVfY29uc3RhbnQsdXBfcmVjX2Zsb3dfY29udHJvbDp1bmRlZmluZWQsYnJ1c2hfZHVwbGljYXRlOmRlZmF1bHQscGN0cl9jcG06Y3BtLHBjdHJfdjI6bHJfY29uc3RhbnQsZHluYW1pY19mbG93X2NvbnRyb2w6c3BsaXQgdGhlIGZsb3cgYnkgbWlkLHBjdnI6ZGxkLGZyZXFMaW1pdDpkZWZhdWx0LHNtYWxsQ29uc3VtZVVuaXQ6ZGVmYXVsdCxvdXRlckJlYXRJbm5lcjpkZWZhdWx0LG91dGVyUXVpdDpkZWZhdWx0LGZkc19ydHQ6OCxjcGE6Y3BhXzMwZCxpbmRpc19VVjp1bmRlZmluZWQsaGFzaF9pbmRpc19VVjp1bmRlZmluZWQsZmVlZHNfcmFuZG9tX3Jlc3VsdDpkZWZhdWx0LGZsb3dfcmF0aW9fY2hlY2s6cjMsYmFzZV9oYXNoX2luZGlzX1VWOnVuZGVmaW5lZCxjdHJfdHJ1bmNhdGlvbl9leHA6dHJ1bmNhdGlvbl8xNTAsZG1wX2FnZV9leHA6dW5kZWZpbmVkLGNvbGRfYm9vdF9leHA6ZGVmYXVsdCxwbGF0Zm9ybTpkZWZhdWx0oAEyqAEtsgEgkDuw0OrDHgDt6D6Tg9G2PUuOCJy0p/+xxNcqVhORml26AWlodHRwczovL3Jlcy5jYy5jbWJpbWcuY29tL2l0YWZyb250L0Zyb2cvaW5kZXguaHRtbCMvbG9naW4vYXBpc2NmZ28vcmVtb3RlP3dlYkFkZHJlc3M9TjM3MDBNTTIwOTE0MTk5MDAwYmnCAaEBMjk1MF8xMjYyXzc0OF83MDJfNjQyXzU1OF81MTBfNDE4XzQxOF80MTJfNDEyXzQxMl80MDhfNDA4XzQwOF8zOThfMzk4XzM0OV8zNDlfMzQ5XzM0OV8zNDlfMzQ5XzMzOF8zMzhfMzM4XzMzOF8zMzhfMzM4XzMzM18zMjlfMzI5XzMyOV8zMjlfMzI5XzI5M18yOTNfMTUwXzE1MF8xMTPSAQDYASbgAcCaDOgBwJoM8AEA+AEygAICiAIAkgLnAjQxOTU4N18xNTY0NjQ4MTAwLDQxMzI1Ml8xNTY0NjQ4MTA5LDM3ODQxOV8xNTY0NjQ4MTE1LDQwNjAxN18xNTY0NjQ4MTUyLDM0NTQ2M18xNTY0NjQ4NDAxLDQxNDcyM18xNTY0NjQ4NDA5LDQwOTQwM18xNTY0NjQ4NDM1LDQxNTU5NF8xNTY0NjQ4NDUyLDQxNzMzNF8xNTY0NjQ4NDU2LDQxMDI2NV8xNTY0NjQ4NDYwLDQxMTAxOV8xNTY0NjQ4NDY0LDQxNDcyM18xNTY0NjQ4NDY4LDM1NTU0OF8xNTY0NjQ4NDcxLDQwOTQwM18xNTY0NjQ4NDg0LDQwNjE1N18xNTY0NjQ4NTA4LDQxOTY3N18xNTY0NjQ4NjIwLDQwNTk5MF8xNTY0NjQ4NjQ3LDM3ODQxOV8xNTY0NjQ5MzQ4LDQxODY1Ml8xNTY0NjQ5MzQ4LDQxODY3MV8xNTY0NjQ5Mzk0mAKpnCagArcZqAK+6ROwAo8NuAIAwAIAyAIA0AIA2AIA6gIA8AIA+AIAqAMA
                 * resource : 1897
                 * source : 1899
                 * request_id : 1564654717388q172a22a60a236q15641
                 * is_ad : true
                 * cm_mark : 1
                 * index : 2
                 * is_ad_loc : true
                 * card_index : 5
                 * client_ip : 36.157.178.181
                 * extra : {"use_ad_web_v2":true,"show_urls":[],"click_urls":[],"download_whitelist":[],"open_whitelist":[],"card":{"card_type":3,"title":"献给热爱FGO的你","covers":[{"url":"https://i0.hdslb.com/bfs/sycp/creative_img/201907/bf8d098b3943940fbbe7a229c0bf92bb.jpg_640x400.jpg","loop":0}],"jump_url":"https://cm.bilibili.com/cm/api/fees/wise/redirect?ad_cb=COjNBhDA9RgY656kCiAyKAEw0DA46w5CITE1NjQ2NTQ3MTczODhxMTcyYTIyYTYwYTIzNnExNTY0MUjMk8HlxC1SBuWohOW6lVoG5rmW5Y2XYgbkuK3lm71oAXAAeICAgIDgBIABA4gBAJIBDjM2LjE1Ny4xNzguMTgxmgGwBGFsbDpkZWZhdWx0LGVjcG06ZGVmYXVsdCxjcGNUYWdGaWx0ZXI6dW5kZWZpbmVkLGVuaGFuY2VDdHJRRmFjdG9yOnNxdWFyZSxwbGF5cGFnZWN0cjplbmFibGVfY29uc3RhbnQsdXBfcmVjX2Zsb3dfY29udHJvbDp1bmRlZmluZWQsYnJ1c2hfZHVwbGljYXRlOmRlZmF1bHQscGN0cl9jcG06Y3BtLHBjdHJfdjI6bHJfY29uc3RhbnQsZHluYW1pY19mbG93X2NvbnRyb2w6c3BsaXQgdGhlIGZsb3cgYnkgbWlkLHBjdnI6ZGxkLGZyZXFMaW1pdDpkZWZhdWx0LHNtYWxsQ29uc3VtZVVuaXQ6ZGVmYXVsdCxvdXRlckJlYXRJbm5lcjpkZWZhdWx0LG91dGVyUXVpdDpkZWZhdWx0LGZkc19ydHQ6OCxjcGE6Y3BhXzMwZCxpbmRpc19VVjp1bmRlZmluZWQsaGFzaF9pbmRpc19VVjp1bmRlZmluZWQsZmVlZHNfcmFuZG9tX3Jlc3VsdDpkZWZhdWx0LGZsb3dfcmF0aW9fY2hlY2s6cjMsYmFzZV9oYXNoX2luZGlzX1VWOnVuZGVmaW5lZCxjdHJfdHJ1bmNhdGlvbl9leHA6dHJ1bmNhdGlvbl8xNTAsZG1wX2FnZV9leHA6dW5kZWZpbmVkLGNvbGRfYm9vdF9leHA6ZGVmYXVsdCxwbGF0Zm9ybTpkZWZhdWx0oAEyqAEtsgEgkDuw0OrDHgDt6D6Tg9G2PUuOCJy0p%2F%2BxxNcqVhORml26AWlodHRwczovL3Jlcy5jYy5jbWJpbWcuY29tL2l0YWZyb250L0Zyb2cvaW5kZXguaHRtbCMvbG9naW4vYXBpc2NmZ28vcmVtb3RlP3dlYkFkZHJlc3M9TjM3MDBNTTIwOTE0MTk5MDAwYmnCAaEBMjk1MF8xMjYyXzc0OF83MDJfNjQyXzU1OF81MTBfNDE4XzQxOF80MTJfNDEyXzQxMl80MDhfNDA4XzQwOF8zOThfMzk4XzM0OV8zNDlfMzQ5XzM0OV8zNDlfMzQ5XzMzOF8zMzhfMzM4XzMzOF8zMzhfMzM4XzMzM18zMjlfMzI5XzMyOV8zMjlfMzI5XzI5M18yOTNfMTUwXzE1MF8xMTPSAQDYASbgAcCaDOgBwJoM8AEA%2BAEygAICiAIAkgLnAjQxOTU4N18xNTY0NjQ4MTAwLDQxMzI1Ml8xNTY0NjQ4MTA5LDM3ODQxOV8xNTY0NjQ4MTE1LDQwNjAxN18xNTY0NjQ4MTUyLDM0NTQ2M18xNTY0NjQ4NDAxLDQxNDcyM18xNTY0NjQ4NDA5LDQwOTQwM18xNTY0NjQ4NDM1LDQxNTU5NF8xNTY0NjQ4NDUyLDQxNzMzNF8xNTY0NjQ4NDU2LDQxMDI2NV8xNTY0NjQ4NDYwLDQxMTAxOV8xNTY0NjQ4NDY0LDQxNDcyM18xNTY0NjQ4NDY4LDM1NTU0OF8xNTY0NjQ4NDcxLDQwOTQwM18xNTY0NjQ4NDg0LDQwNjE1N18xNTY0NjQ4NTA4LDQxOTY3N18xNTY0NjQ4NjIwLDQwNTk5MF8xNTY0NjQ4NjQ3LDM3ODQxOV8xNTY0NjQ5MzQ4LDQxODY1Ml8xNTY0NjQ5MzQ4LDQxODY3MV8xNTY0NjQ5Mzk0mAKpnCagArcZqAK%2B6ROwAo8NuAIAwAIAyAIA0AIA2AIA6gIA8AIA%2BAIAqAMA","desc":"招商银行","callup_url":"","long_desc":"","ad_tag":"","extra_desc":"","ad_tag_style":{"type":2,"text":"广告","text_color":"#999999FF","bg_border_color":"#999999FF"},"feedback_panel":{"panel_type_text":"广告","feedback_panel_detail":[{"text":"我不想看到这个广告","module_id":1,"jump_type":1,"icon_url":"https://i0.hdslb.com/bfs/sycp/mng/201907/a53df8f189bb12666a39d10ad1babcf5.png","jump_url":"","secondary_panel":[{"text":"不感兴趣","reason_id":1},{"text":"相似内容过多","reason_id":2},{"text":"广告质量差","reason_id":5}]},{"text":"举报","module_id":2,"jump_type":2,"icon_url":"https://i0.hdslb.com/bfs/sycp/mng/201907/2bc344ad3510da5cfdc7c7714abaeda4.png","jump_url":"http://cm.bilibili.com/ldad/light/ad-complain.html","secondary_panel":[]},{"text":"我为什么会看到此广告","module_id":3,"jump_type":2,"icon_url":"https://i0.hdslb.com/bfs/sycp/mng/201907/82480c4ef205c9b715d6e2ea7f5c4041.png","jump_url":"http://cm.bilibili.com/ldad/light/ad-introduce.html","secondary_panel":[]}]}},"report_time":2000,"sales_type":12,"special_industry":false,"special_industry_tips":"","preload_landingpage":0,"enable_download_dialog":false,"share_info":{}}
                 */

                private String creative_id;
                private int creative_type;
                private int card_type;
                private CreativeContentBean creative_content;
                private String ad_cb;
                private int resource;
                private int source;
                private String request_id;
                private boolean is_ad;
                private int cm_mark;
                private int index;
                private boolean is_ad_loc;
                private int card_index;
                private String client_ip;
                private ExtraBean extra;

                public String getCreative_id() {
                    return creative_id;
                }

                public void setCreative_id(String creative_id) {
                    this.creative_id = creative_id;
                }

                public int getCreative_type() {
                    return creative_type;
                }

                public void setCreative_type(int creative_type) {
                    this.creative_type = creative_type;
                }

                public int getCard_type() {
                    return card_type;
                }

                public void setCard_type(int card_type) {
                    this.card_type = card_type;
                }

                public CreativeContentBean getCreative_content() {
                    return creative_content;
                }

                public void setCreative_content(CreativeContentBean creative_content) {
                    this.creative_content = creative_content;
                }

                public String getAd_cb() {
                    return ad_cb;
                }

                public void setAd_cb(String ad_cb) {
                    this.ad_cb = ad_cb;
                }

                public int getResource() {
                    return resource;
                }

                public void setResource(int resource) {
                    this.resource = resource;
                }

                public int getSource() {
                    return source;
                }

                public void setSource(int source) {
                    this.source = source;
                }

                public String getRequest_id() {
                    return request_id;
                }

                public void setRequest_id(String request_id) {
                    this.request_id = request_id;
                }

                public boolean isIs_ad() {
                    return is_ad;
                }

                public void setIs_ad(boolean is_ad) {
                    this.is_ad = is_ad;
                }

                public int getCm_mark() {
                    return cm_mark;
                }

                public void setCm_mark(int cm_mark) {
                    this.cm_mark = cm_mark;
                }

                public int getIndex() {
                    return index;
                }

                public void setIndex(int index) {
                    this.index = index;
                }

                public boolean isIs_ad_loc() {
                    return is_ad_loc;
                }

                public void setIs_ad_loc(boolean is_ad_loc) {
                    this.is_ad_loc = is_ad_loc;
                }

                public int getCard_index() {
                    return card_index;
                }

                public void setCard_index(int card_index) {
                    this.card_index = card_index;
                }

                public String getClient_ip() {
                    return client_ip;
                }

                public void setClient_ip(String client_ip) {
                    this.client_ip = client_ip;
                }

                public ExtraBean getExtra() {
                    return extra;
                }

                public void setExtra(ExtraBean extra) {
                    this.extra = extra;
                }

                public static class CreativeContentBean {
                    /**
                     * title : 献给热爱FGO的你
                     * description : 招商银行
                     * image_url : https://i0.hdslb.com/bfs/sycp/creative_img/201907/bf8d098b3943940fbbe7a229c0bf92bb.jpg_640x400.jpg
                     * image_md5 : 62f3751949063f94908a681c71b73e8c
                     * url : https://cm.bilibili.com/cm/api/fees/wise/redirect?ad_cb=COjNBhDA9RgY656kCiAyKAEw0DA46w5CITE1NjQ2NTQ3MTczODhxMTcyYTIyYTYwYTIzNnExNTY0MUjMk8HlxC1SBuWohOW6lVoG5rmW5Y2XYgbkuK3lm71oAXAAeICAgIDgBIABA4gBAJIBDjM2LjE1Ny4xNzguMTgxmgGwBGFsbDpkZWZhdWx0LGVjcG06ZGVmYXVsdCxjcGNUYWdGaWx0ZXI6dW5kZWZpbmVkLGVuaGFuY2VDdHJRRmFjdG9yOnNxdWFyZSxwbGF5cGFnZWN0cjplbmFibGVfY29uc3RhbnQsdXBfcmVjX2Zsb3dfY29udHJvbDp1bmRlZmluZWQsYnJ1c2hfZHVwbGljYXRlOmRlZmF1bHQscGN0cl9jcG06Y3BtLHBjdHJfdjI6bHJfY29uc3RhbnQsZHluYW1pY19mbG93X2NvbnRyb2w6c3BsaXQgdGhlIGZsb3cgYnkgbWlkLHBjdnI6ZGxkLGZyZXFMaW1pdDpkZWZhdWx0LHNtYWxsQ29uc3VtZVVuaXQ6ZGVmYXVsdCxvdXRlckJlYXRJbm5lcjpkZWZhdWx0LG91dGVyUXVpdDpkZWZhdWx0LGZkc19ydHQ6OCxjcGE6Y3BhXzMwZCxpbmRpc19VVjp1bmRlZmluZWQsaGFzaF9pbmRpc19VVjp1bmRlZmluZWQsZmVlZHNfcmFuZG9tX3Jlc3VsdDpkZWZhdWx0LGZsb3dfcmF0aW9fY2hlY2s6cjMsYmFzZV9oYXNoX2luZGlzX1VWOnVuZGVmaW5lZCxjdHJfdHJ1bmNhdGlvbl9leHA6dHJ1bmNhdGlvbl8xNTAsZG1wX2FnZV9leHA6dW5kZWZpbmVkLGNvbGRfYm9vdF9leHA6ZGVmYXVsdCxwbGF0Zm9ybTpkZWZhdWx0oAEyqAEtsgEgkDuw0OrDHgDt6D6Tg9G2PUuOCJy0p%2F%2BxxNcqVhORml26AWlodHRwczovL3Jlcy5jYy5jbWJpbWcuY29tL2l0YWZyb250L0Zyb2cvaW5kZXguaHRtbCMvbG9naW4vYXBpc2NmZ28vcmVtb3RlP3dlYkFkZHJlc3M9TjM3MDBNTTIwOTE0MTk5MDAwYmnCAaEBMjk1MF8xMjYyXzc0OF83MDJfNjQyXzU1OF81MTBfNDE4XzQxOF80MTJfNDEyXzQxMl80MDhfNDA4XzQwOF8zOThfMzk4XzM0OV8zNDlfMzQ5XzM0OV8zNDlfMzQ5XzMzOF8zMzhfMzM4XzMzOF8zMzhfMzM4XzMzM18zMjlfMzI5XzMyOV8zMjlfMzI5XzI5M18yOTNfMTUwXzE1MF8xMTPSAQDYASbgAcCaDOgBwJoM8AEA%2BAEygAICiAIAkgLnAjQxOTU4N18xNTY0NjQ4MTAwLDQxMzI1Ml8xNTY0NjQ4MTA5LDM3ODQxOV8xNTY0NjQ4MTE1LDQwNjAxN18xNTY0NjQ4MTUyLDM0NTQ2M18xNTY0NjQ4NDAxLDQxNDcyM18xNTY0NjQ4NDA5LDQwOTQwM18xNTY0NjQ4NDM1LDQxNTU5NF8xNTY0NjQ4NDUyLDQxNzMzNF8xNTY0NjQ4NDU2LDQxMDI2NV8xNTY0NjQ4NDYwLDQxMTAxOV8xNTY0NjQ4NDY0LDQxNDcyM18xNTY0NjQ4NDY4LDM1NTU0OF8xNTY0NjQ4NDcxLDQwOTQwM18xNTY0NjQ4NDg0LDQwNjE1N18xNTY0NjQ4NTA4LDQxOTY3N18xNTY0NjQ4NjIwLDQwNTk5MF8xNTY0NjQ4NjQ3LDM3ODQxOV8xNTY0NjQ5MzQ4LDQxODY1Ml8xNTY0NjQ5MzQ4LDQxODY3MV8xNTY0NjQ5Mzk0mAKpnCagArcZqAK%2B6ROwAo8NuAIAwAIAyAIA0AIA2AIA6gIA8AIA%2BAIAqAMA
                     */

                    private String title;
                    private String description;
                    private String image_url;
                    private String image_md5;
                    private String url;

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }

                    public String getImage_url() {
                        return image_url;
                    }

                    public void setImage_url(String image_url) {
                        this.image_url = image_url;
                    }

                    public String getImage_md5() {
                        return image_md5;
                    }

                    public void setImage_md5(String image_md5) {
                        this.image_md5 = image_md5;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }
                }

                public static class ExtraBean {
                    /**
                     * use_ad_web_v2 : true
                     * show_urls : []
                     * click_urls : []
                     * download_whitelist : []
                     * open_whitelist : []
                     * card : {"card_type":3,"title":"献给热爱FGO的你","covers":[{"url":"https://i0.hdslb.com/bfs/sycp/creative_img/201907/bf8d098b3943940fbbe7a229c0bf92bb.jpg_640x400.jpg","loop":0}],"jump_url":"https://cm.bilibili.com/cm/api/fees/wise/redirect?ad_cb=COjNBhDA9RgY656kCiAyKAEw0DA46w5CITE1NjQ2NTQ3MTczODhxMTcyYTIyYTYwYTIzNnExNTY0MUjMk8HlxC1SBuWohOW6lVoG5rmW5Y2XYgbkuK3lm71oAXAAeICAgIDgBIABA4gBAJIBDjM2LjE1Ny4xNzguMTgxmgGwBGFsbDpkZWZhdWx0LGVjcG06ZGVmYXVsdCxjcGNUYWdGaWx0ZXI6dW5kZWZpbmVkLGVuaGFuY2VDdHJRRmFjdG9yOnNxdWFyZSxwbGF5cGFnZWN0cjplbmFibGVfY29uc3RhbnQsdXBfcmVjX2Zsb3dfY29udHJvbDp1bmRlZmluZWQsYnJ1c2hfZHVwbGljYXRlOmRlZmF1bHQscGN0cl9jcG06Y3BtLHBjdHJfdjI6bHJfY29uc3RhbnQsZHluYW1pY19mbG93X2NvbnRyb2w6c3BsaXQgdGhlIGZsb3cgYnkgbWlkLHBjdnI6ZGxkLGZyZXFMaW1pdDpkZWZhdWx0LHNtYWxsQ29uc3VtZVVuaXQ6ZGVmYXVsdCxvdXRlckJlYXRJbm5lcjpkZWZhdWx0LG91dGVyUXVpdDpkZWZhdWx0LGZkc19ydHQ6OCxjcGE6Y3BhXzMwZCxpbmRpc19VVjp1bmRlZmluZWQsaGFzaF9pbmRpc19VVjp1bmRlZmluZWQsZmVlZHNfcmFuZG9tX3Jlc3VsdDpkZWZhdWx0LGZsb3dfcmF0aW9fY2hlY2s6cjMsYmFzZV9oYXNoX2luZGlzX1VWOnVuZGVmaW5lZCxjdHJfdHJ1bmNhdGlvbl9leHA6dHJ1bmNhdGlvbl8xNTAsZG1wX2FnZV9leHA6dW5kZWZpbmVkLGNvbGRfYm9vdF9leHA6ZGVmYXVsdCxwbGF0Zm9ybTpkZWZhdWx0oAEyqAEtsgEgkDuw0OrDHgDt6D6Tg9G2PUuOCJy0p%2F%2BxxNcqVhORml26AWlodHRwczovL3Jlcy5jYy5jbWJpbWcuY29tL2l0YWZyb250L0Zyb2cvaW5kZXguaHRtbCMvbG9naW4vYXBpc2NmZ28vcmVtb3RlP3dlYkFkZHJlc3M9TjM3MDBNTTIwOTE0MTk5MDAwYmnCAaEBMjk1MF8xMjYyXzc0OF83MDJfNjQyXzU1OF81MTBfNDE4XzQxOF80MTJfNDEyXzQxMl80MDhfNDA4XzQwOF8zOThfMzk4XzM0OV8zNDlfMzQ5XzM0OV8zNDlfMzQ5XzMzOF8zMzhfMzM4XzMzOF8zMzhfMzM4XzMzM18zMjlfMzI5XzMyOV8zMjlfMzI5XzI5M18yOTNfMTUwXzE1MF8xMTPSAQDYASbgAcCaDOgBwJoM8AEA%2BAEygAICiAIAkgLnAjQxOTU4N18xNTY0NjQ4MTAwLDQxMzI1Ml8xNTY0NjQ4MTA5LDM3ODQxOV8xNTY0NjQ4MTE1LDQwNjAxN18xNTY0NjQ4MTUyLDM0NTQ2M18xNTY0NjQ4NDAxLDQxNDcyM18xNTY0NjQ4NDA5LDQwOTQwM18xNTY0NjQ4NDM1LDQxNTU5NF8xNTY0NjQ4NDUyLDQxNzMzNF8xNTY0NjQ4NDU2LDQxMDI2NV8xNTY0NjQ4NDYwLDQxMTAxOV8xNTY0NjQ4NDY0LDQxNDcyM18xNTY0NjQ4NDY4LDM1NTU0OF8xNTY0NjQ4NDcxLDQwOTQwM18xNTY0NjQ4NDg0LDQwNjE1N18xNTY0NjQ4NTA4LDQxOTY3N18xNTY0NjQ4NjIwLDQwNTk5MF8xNTY0NjQ4NjQ3LDM3ODQxOV8xNTY0NjQ5MzQ4LDQxODY1Ml8xNTY0NjQ5MzQ4LDQxODY3MV8xNTY0NjQ5Mzk0mAKpnCagArcZqAK%2B6ROwAo8NuAIAwAIAyAIA0AIA2AIA6gIA8AIA%2BAIAqAMA","desc":"招商银行","callup_url":"","long_desc":"","ad_tag":"","extra_desc":"","ad_tag_style":{"type":2,"text":"广告","text_color":"#999999FF","bg_border_color":"#999999FF"},"feedback_panel":{"panel_type_text":"广告","feedback_panel_detail":[{"text":"我不想看到这个广告","module_id":1,"jump_type":1,"icon_url":"https://i0.hdslb.com/bfs/sycp/mng/201907/a53df8f189bb12666a39d10ad1babcf5.png","jump_url":"","secondary_panel":[{"text":"不感兴趣","reason_id":1},{"text":"相似内容过多","reason_id":2},{"text":"广告质量差","reason_id":5}]},{"text":"举报","module_id":2,"jump_type":2,"icon_url":"https://i0.hdslb.com/bfs/sycp/mng/201907/2bc344ad3510da5cfdc7c7714abaeda4.png","jump_url":"http://cm.bilibili.com/ldad/light/ad-complain.html","secondary_panel":[]},{"text":"我为什么会看到此广告","module_id":3,"jump_type":2,"icon_url":"https://i0.hdslb.com/bfs/sycp/mng/201907/82480c4ef205c9b715d6e2ea7f5c4041.png","jump_url":"http://cm.bilibili.com/ldad/light/ad-introduce.html","secondary_panel":[]}]}}
                     * report_time : 2000
                     * sales_type : 12
                     * special_industry : false
                     * special_industry_tips :
                     * preload_landingpage : 0
                     * enable_download_dialog : false
                     * share_info : {}
                     */

                    private boolean use_ad_web_v2;
                    private CardBean card;
                    private int report_time;
                    private int sales_type;
                    private boolean special_industry;
                    private String special_industry_tips;
                    private int preload_landingpage;
                    private boolean enable_download_dialog;
                    private ShareInfoBean share_info;
                    private List<?> show_urls;
                    private List<?> click_urls;
                    private List<?> download_whitelist;
                    private List<?> open_whitelist;

                    public boolean isUse_ad_web_v2() {
                        return use_ad_web_v2;
                    }

                    public void setUse_ad_web_v2(boolean use_ad_web_v2) {
                        this.use_ad_web_v2 = use_ad_web_v2;
                    }

                    public CardBean getCard() {
                        return card;
                    }

                    public void setCard(CardBean card) {
                        this.card = card;
                    }

                    public int getReport_time() {
                        return report_time;
                    }

                    public void setReport_time(int report_time) {
                        this.report_time = report_time;
                    }

                    public int getSales_type() {
                        return sales_type;
                    }

                    public void setSales_type(int sales_type) {
                        this.sales_type = sales_type;
                    }

                    public boolean isSpecial_industry() {
                        return special_industry;
                    }

                    public void setSpecial_industry(boolean special_industry) {
                        this.special_industry = special_industry;
                    }

                    public String getSpecial_industry_tips() {
                        return special_industry_tips;
                    }

                    public void setSpecial_industry_tips(String special_industry_tips) {
                        this.special_industry_tips = special_industry_tips;
                    }

                    public int getPreload_landingpage() {
                        return preload_landingpage;
                    }

                    public void setPreload_landingpage(int preload_landingpage) {
                        this.preload_landingpage = preload_landingpage;
                    }

                    public boolean isEnable_download_dialog() {
                        return enable_download_dialog;
                    }

                    public void setEnable_download_dialog(boolean enable_download_dialog) {
                        this.enable_download_dialog = enable_download_dialog;
                    }

                    public ShareInfoBean getShare_info() {
                        return share_info;
                    }

                    public void setShare_info(ShareInfoBean share_info) {
                        this.share_info = share_info;
                    }

                    public List<?> getShow_urls() {
                        return show_urls;
                    }

                    public void setShow_urls(List<?> show_urls) {
                        this.show_urls = show_urls;
                    }

                    public List<?> getClick_urls() {
                        return click_urls;
                    }

                    public void setClick_urls(List<?> click_urls) {
                        this.click_urls = click_urls;
                    }

                    public List<?> getDownload_whitelist() {
                        return download_whitelist;
                    }

                    public void setDownload_whitelist(List<?> download_whitelist) {
                        this.download_whitelist = download_whitelist;
                    }

                    public List<?> getOpen_whitelist() {
                        return open_whitelist;
                    }

                    public void setOpen_whitelist(List<?> open_whitelist) {
                        this.open_whitelist = open_whitelist;
                    }

                    public static class CardBean {
                        public static class AdTagStyleBean {
                            /**
                             * type : 2
                             * text : 广告
                             * text_color : #999999FF
                             * bg_border_color : #999999FF
                             */

                            private int type;
                            private String text;
                            private String text_color;
                            private String bg_border_color;

                            public int getType() {
                                return type;
                            }

                            public void setType(int type) {
                                this.type = type;
                            }

                            public String getText() {
                                return text;
                            }

                            public void setText(String text) {
                                this.text = text;
                            }

                            public String getText_color() {
                                return text_color;
                            }

                            public void setText_color(String text_color) {
                                this.text_color = text_color;
                            }

                            public String getBg_border_color() {
                                return bg_border_color;
                            }

                            public void setBg_border_color(String bg_border_color) {
                                this.bg_border_color = bg_border_color;
                            }
                        }

                        public static class FeedbackPanelBean {
                            /**
                             * panel_type_text : 广告
                             * feedback_panel_detail : [{"text":"我不想看到这个广告","module_id":1,"jump_type":1,"icon_url":"https://i0.hdslb.com/bfs/sycp/mng/201907/a53df8f189bb12666a39d10ad1babcf5.png","jump_url":"","secondary_panel":[{"text":"不感兴趣","reason_id":1},{"text":"相似内容过多","reason_id":2},{"text":"广告质量差","reason_id":5}]},{"text":"举报","module_id":2,"jump_type":2,"icon_url":"https://i0.hdslb.com/bfs/sycp/mng/201907/2bc344ad3510da5cfdc7c7714abaeda4.png","jump_url":"http://cm.bilibili.com/ldad/light/ad-complain.html","secondary_panel":[]},{"text":"我为什么会看到此广告","module_id":3,"jump_type":2,"icon_url":"https://i0.hdslb.com/bfs/sycp/mng/201907/82480c4ef205c9b715d6e2ea7f5c4041.png","jump_url":"http://cm.bilibili.com/ldad/light/ad-introduce.html","secondary_panel":[]}]
                             */

                            private String panel_type_text;
                            private List<FeedbackPanelDetailBean> feedback_panel_detail;

                            public String getPanel_type_text() {
                                return panel_type_text;
                            }

                            public void setPanel_type_text(String panel_type_text) {
                                this.panel_type_text = panel_type_text;
                            }

                            public List<FeedbackPanelDetailBean> getFeedback_panel_detail() {
                                return feedback_panel_detail;
                            }

                            public void setFeedback_panel_detail(List<FeedbackPanelDetailBean> feedback_panel_detail) {
                                this.feedback_panel_detail = feedback_panel_detail;
                            }

                            public static class FeedbackPanelDetailBean {
                                /**
                                 * text : 我不想看到这个广告
                                 * module_id : 1
                                 * jump_type : 1
                                 * icon_url : https://i0.hdslb.com/bfs/sycp/mng/201907/a53df8f189bb12666a39d10ad1babcf5.png
                                 * jump_url :
                                 * secondary_panel : [{"text":"不感兴趣","reason_id":1},{"text":"相似内容过多","reason_id":2},{"text":"广告质量差","reason_id":5}]
                                 */

                                private String text;
                                private int module_id;
                                private int jump_type;
                                private String icon_url;
                                private String jump_url;
                                private List<SecondaryPanelBean> secondary_panel;

                                public String getText() {
                                    return text;
                                }

                                public void setText(String text) {
                                    this.text = text;
                                }

                                public int getModule_id() {
                                    return module_id;
                                }

                                public void setModule_id(int module_id) {
                                    this.module_id = module_id;
                                }

                                public int getJump_type() {
                                    return jump_type;
                                }

                                public void setJump_type(int jump_type) {
                                    this.jump_type = jump_type;
                                }

                                public String getIcon_url() {
                                    return icon_url;
                                }

                                public void setIcon_url(String icon_url) {
                                    this.icon_url = icon_url;
                                }

                                public String getJump_url() {
                                    return jump_url;
                                }

                                public void setJump_url(String jump_url) {
                                    this.jump_url = jump_url;
                                }

                                public List<SecondaryPanelBean> getSecondary_panel() {
                                    return secondary_panel;
                                }

                                public void setSecondary_panel(List<SecondaryPanelBean> secondary_panel) {
                                    this.secondary_panel = secondary_panel;
                                }

                                public static class SecondaryPanelBean {
                                    /**
                                     * text : 不感兴趣
                                     * reason_id : 1
                                     */

                                    private String text;
                                    private int reason_id;

                                    public String getText() {
                                        return text;
                                    }

                                    public void setText(String text) {
                                        this.text = text;
                                    }

                                    public int getReason_id() {
                                        return reason_id;
                                    }

                                    public void setReason_id(int reason_id) {
                                        this.reason_id = reason_id;
                                    }
                                }
                            }
                        }

                        public static class CoversBean {
                        }
                    }

                    public static class ShareInfoBean {
                    }
                }
            }

            public static class BannerItemBean {
                /**
                 * id : 332204
                 * title : 局座 浅澄月终于面基了~
                 * image : http://i0.hdslb.com/bfs/archive/ca8b8b1dabf00e7c92072bc7da68302cbf84b888.jpg
                 * hash : 5b61501892aee8e20467b71a58f2f0ef
                 * uri : https://www.bilibili.com/video/av61422525/
                 * request_id : 1564654717451q172a22a48a149q14459
                 * src_id : 702
                 * is_ad_loc : true
                 * client_ip : 36.157.178.181
                 * server_type : 0
                 * resource_id : 631
                 * index : 1
                 * cm_mark : 0
                 * creative_id : 259392610263814144
                 * is_ad : true
                 * ad_cb : CAAQABiAoIvBxobjzAMgACgAMCQ4vwVCITE1NjQ2NTQ3MTc0NTFxMTcyYTIyYTQ4YTE0OXExNDQ1OUiLlMHlxC1SBuWohOW6lVoG5rmW5Y2XYgbkuK3lm71oAXAAeICAgIAQgAEAiAHvQJIBDjM2LjE1Ny4xNzguMTgxmgG5BGFsbDpjcGNfY3Jvd2RfdGFyZ2V0LGVjcG06ZGVmYXVsdCxjcGNUYWdGaWx0ZXI6dW5kZWZpbmVkLGVuaGFuY2VDdHJRRmFjdG9yOnNxdWFyZSxwbGF5cGFnZWN0cjplbmFibGVfY29uc3RhbnQsdXBfcmVjX2Zsb3dfY29udHJvbDp1bmRlZmluZWQsYnJ1c2hfZHVwbGljYXRlOmRlZmF1bHQscGN0cl9jcG06Y3BtLHBjdHJfdjI6bHJfY29uc3RhbnQsZHluYW1pY19mbG93X2NvbnRyb2w6c3BsaXQgdGhlIGZsb3cgYnkgbWlkLHBjdnI6ZGxkLGZyZXFMaW1pdDpkZWZhdWx0LHNtYWxsQ29uc3VtZVVuaXQ6ZGVmYXVsdCxvdXRlckJlYXRJbm5lcjpkZWZhdWx0LG91dGVyUXVpdDpkZWZhdWx0LGZkc19ydHQ6OCxjcGE6Y3BhXzMwZCxpbmRpc19VVjp1bmRlZmluZWQsaGFzaF9pbmRpc19VVjp1bmRlZmluZWQsZmVlZHNfcmFuZG9tX3Jlc3VsdDpkZWZhdWx0LGZsb3dfcmF0aW9fY2hlY2s6cjMsYmFzZV9oYXNoX2luZGlzX1VWOnVuZGVmaW5lZCxjdHJfdHJ1bmNhdGlvbl9leHA6dHJ1bmNhdGlvbl8xNTAsZG1wX2FnZV9leHA6dW5kZWZpbmVkLGNvbGRfYm9vdF9leHA6ZGVmYXVsdCxwbGF0Zm9ybTpkZWZhdWx0oAEAqAEAsgEgsKUaYcX+XTV3eWZWWHv6caz4hEzSXGMbD0D2hG1jnrK6ASlodHRwczovL2dhbWUuYmlsaWJpbGkuY29tL2luZGllZ2FtZS9mYi1oNcIBANIBANgBAeABAOgBAPABAPgBAIACAIgCALgCAMACAMgCANACANgCAOoCAPACie0D+ALmAagDAA==
                 * extra : {"use_ad_web_v2":false,"show_urls":[],"click_urls":[],"download_whitelist":[],"open_whitelist":[],"card":{"card_type":0,"title":"","covers":[{"url":"https://i0.hdslb.com/bfs/sycp/creative_img/201907/6661b7498c233b33c3bea90a0e87a21d.jpg","loop":0}],"jump_url":"https://game.bilibili.com/indiegame/fb-h5","desc":"","callup_url":"","long_desc":"","ad_tag":"","extra_desc":"","ad_tag_style":{"type":2,"text":"广告","text_color":"#999999FF","bg_border_color":"#999999FF"},"feedback_panel":{"panel_type_text":"广告","feedback_panel_detail":[]}},"report_time":2000,"sales_type":31,"special_industry":false,"special_industry_tips":"","preload_landingpage":0,"share_info":{}}
                 * click_url : https://ad-bili-data.biligame.com/api/mobile/clickBili?ad_plan_id=36594&mid=__MID__&os=0&idfa=__IDFA__&buvid=__BUVID__&android_id=__ANDROIDID__&imei=__IMEI__&mac=__MAC__&duid=__DUID__&ip=36.157.178.181&request_id=1564654717451q172a22a48a149q14459&ts=__TS__&ua=__UA__
                 */

                private int id;
                private String title;
                private String image;
                private String hash;
                private String uri;
                private String request_id;
                private int src_id;
                private boolean is_ad_loc;
                private String client_ip;
                private int server_type;
                private int resource_id;
                private int index;
                private int cm_mark;
                private long creative_id;
                private boolean is_ad;
                private String ad_cb;
                private ExtraBeanX extra;
                private String click_url;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }

                public String getHash() {
                    return hash;
                }

                public void setHash(String hash) {
                    this.hash = hash;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public String getRequest_id() {
                    return request_id;
                }

                public void setRequest_id(String request_id) {
                    this.request_id = request_id;
                }

                public int getSrc_id() {
                    return src_id;
                }

                public void setSrc_id(int src_id) {
                    this.src_id = src_id;
                }

                public boolean isIs_ad_loc() {
                    return is_ad_loc;
                }

                public void setIs_ad_loc(boolean is_ad_loc) {
                    this.is_ad_loc = is_ad_loc;
                }

                public String getClient_ip() {
                    return client_ip;
                }

                public void setClient_ip(String client_ip) {
                    this.client_ip = client_ip;
                }

                public int getServer_type() {
                    return server_type;
                }

                public void setServer_type(int server_type) {
                    this.server_type = server_type;
                }

                public int getResource_id() {
                    return resource_id;
                }

                public void setResource_id(int resource_id) {
                    this.resource_id = resource_id;
                }

                public int getIndex() {
                    return index;
                }

                public void setIndex(int index) {
                    this.index = index;
                }

                public int getCm_mark() {
                    return cm_mark;
                }

                public void setCm_mark(int cm_mark) {
                    this.cm_mark = cm_mark;
                }

                public long getCreative_id() {
                    return creative_id;
                }

                public void setCreative_id(long creative_id) {
                    this.creative_id = creative_id;
                }

                public boolean isIs_ad() {
                    return is_ad;
                }

                public void setIs_ad(boolean is_ad) {
                    this.is_ad = is_ad;
                }

                public String getAd_cb() {
                    return ad_cb;
                }

                public void setAd_cb(String ad_cb) {
                    this.ad_cb = ad_cb;
                }

                public ExtraBeanX getExtra() {
                    return extra;
                }

                public void setExtra(ExtraBeanX extra) {
                    this.extra = extra;
                }

                public String getClick_url() {
                    return click_url;
                }

                public void setClick_url(String click_url) {
                    this.click_url = click_url;
                }

                public static class ExtraBeanX {
                    /**
                     * use_ad_web_v2 : false
                     * show_urls : []
                     * click_urls : []
                     * download_whitelist : []
                     * open_whitelist : []
                     * card : {"card_type":0,"title":"","covers":[{"url":"https://i0.hdslb.com/bfs/sycp/creative_img/201907/6661b7498c233b33c3bea90a0e87a21d.jpg","loop":0}],"jump_url":"https://game.bilibili.com/indiegame/fb-h5","desc":"","callup_url":"","long_desc":"","ad_tag":"","extra_desc":"","ad_tag_style":{"type":2,"text":"广告","text_color":"#999999FF","bg_border_color":"#999999FF"},"feedback_panel":{"panel_type_text":"广告","feedback_panel_detail":[]}}
                     * report_time : 2000
                     * sales_type : 31
                     * special_industry : false
                     * special_industry_tips :
                     * preload_landingpage : 0
                     * share_info : {}
                     */

                    private boolean use_ad_web_v2;
                    private CardBeanX card;
                    private int report_time;
                    private int sales_type;
                    private boolean special_industry;
                    private String special_industry_tips;
                    private int preload_landingpage;
                    private ShareInfoBeanX share_info;
                    private List<?> show_urls;
                    private List<?> click_urls;
                    private List<?> download_whitelist;
                    private List<?> open_whitelist;

                    public boolean isUse_ad_web_v2() {
                        return use_ad_web_v2;
                    }

                    public void setUse_ad_web_v2(boolean use_ad_web_v2) {
                        this.use_ad_web_v2 = use_ad_web_v2;
                    }

                    public CardBeanX getCard() {
                        return card;
                    }

                    public void setCard(CardBeanX card) {
                        this.card = card;
                    }

                    public int getReport_time() {
                        return report_time;
                    }

                    public void setReport_time(int report_time) {
                        this.report_time = report_time;
                    }

                    public int getSales_type() {
                        return sales_type;
                    }

                    public void setSales_type(int sales_type) {
                        this.sales_type = sales_type;
                    }

                    public boolean isSpecial_industry() {
                        return special_industry;
                    }

                    public void setSpecial_industry(boolean special_industry) {
                        this.special_industry = special_industry;
                    }

                    public String getSpecial_industry_tips() {
                        return special_industry_tips;
                    }

                    public void setSpecial_industry_tips(String special_industry_tips) {
                        this.special_industry_tips = special_industry_tips;
                    }

                    public int getPreload_landingpage() {
                        return preload_landingpage;
                    }

                    public void setPreload_landingpage(int preload_landingpage) {
                        this.preload_landingpage = preload_landingpage;
                    }

                    public ShareInfoBeanX getShare_info() {
                        return share_info;
                    }

                    public void setShare_info(ShareInfoBeanX share_info) {
                        this.share_info = share_info;
                    }

                    public List<?> getShow_urls() {
                        return show_urls;
                    }

                    public void setShow_urls(List<?> show_urls) {
                        this.show_urls = show_urls;
                    }

                    public List<?> getClick_urls() {
                        return click_urls;
                    }

                    public void setClick_urls(List<?> click_urls) {
                        this.click_urls = click_urls;
                    }

                    public List<?> getDownload_whitelist() {
                        return download_whitelist;
                    }

                    public void setDownload_whitelist(List<?> download_whitelist) {
                        this.download_whitelist = download_whitelist;
                    }

                    public List<?> getOpen_whitelist() {
                        return open_whitelist;
                    }

                    public void setOpen_whitelist(List<?> open_whitelist) {
                        this.open_whitelist = open_whitelist;
                    }

                    public static class CardBeanX {
                        public static class AdTagStyleBeanX {
                            /**
                             * type : 2
                             * text : 广告
                             * text_color : #999999FF
                             * bg_border_color : #999999FF
                             */

                            private int type;
                            private String text;
                            private String text_color;
                            private String bg_border_color;

                            public int getType() {
                                return type;
                            }

                            public void setType(int type) {
                                this.type = type;
                            }

                            public String getText() {
                                return text;
                            }

                            public void setText(String text) {
                                this.text = text;
                            }

                            public String getText_color() {
                                return text_color;
                            }

                            public void setText_color(String text_color) {
                                this.text_color = text_color;
                            }

                            public String getBg_border_color() {
                                return bg_border_color;
                            }

                            public void setBg_border_color(String bg_border_color) {
                                this.bg_border_color = bg_border_color;
                            }
                        }

                        public static class FeedbackPanelBeanX {
                            /**
                             * panel_type_text : 广告
                             * feedback_panel_detail : []
                             */

                            private String panel_type_text;
                            private List<?> feedback_panel_detail;

                            public String getPanel_type_text() {
                                return panel_type_text;
                            }

                            public void setPanel_type_text(String panel_type_text) {
                                this.panel_type_text = panel_type_text;
                            }

                            public List<?> getFeedback_panel_detail() {
                                return feedback_panel_detail;
                            }

                            public void setFeedback_panel_detail(List<?> feedback_panel_detail) {
                                this.feedback_panel_detail = feedback_panel_detail;
                            }
                        }

                        public static class CoversBeanX {
                        }
                    }

                    public static class ShareInfoBeanX {
                    }
                }
            }

            public static class ThreePointV2Bean {
                /**
                 * title : 不感兴趣
                 * subtitle : (选择后将减少相似内容推荐)
                 * reasons : [{"id":4,"name":"UP主:唧唧歪歪丶萌"},{"id":2,"name":"分区:CS:GO"},{"id":1,"name":"不感兴趣"}]
                 * type : dislike
                 */

                private String title;
                private String subtitle;
                private String type;
                private List<ReasonsBean> reasons;

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getSubtitle() {
                    return subtitle;
                }

                public void setSubtitle(String subtitle) {
                    this.subtitle = subtitle;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public List<ReasonsBean> getReasons() {
                    return reasons;
                }

                public void setReasons(List<ReasonsBean> reasons) {
                    this.reasons = reasons;
                }

                public static class ReasonsBean {
                    /**
                     * id : 4
                     * name : UP主:唧唧歪歪丶萌
                     */

                    private int id;
                    private String name;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }
                }
            }
        }
    }
}
