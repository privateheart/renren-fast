package io.renren.modules.api.controller;

import io.renren.common.utils.R;
import io.renren.modules.api.entity.BaseVo;
import io.renren.modules.api.entity.RequestAlbumVo;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestSwaggerController {
    private static Logger logger = LoggerFactory.getLogger(TestSwaggerController.class);

        
    @RequestMapping(value="album", method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    @ApiOperation(value="第三方添加专辑", httpMethod ="POST", response=BaseVo.class, notes ="第三方添加专辑")
    public BaseVo postAlbum(@ModelAttribute("requestAlbumVo")RequestAlbumVo requestAlbumVo){
        BaseVo result = new BaseVo();

        return result;
    }    
}    