/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2016 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package buaa.eos.controller;

/*import buaa.eos.service.CountryService;*/
import buaa.eos.service.CommonService;
import buaa.eos.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import buaa.eos.service.BlockService;
import org.springframework.ui.ModelMap;
/**
 * @author liuzh
 * @since 2015-12-19 11:10
 */
@Controller
public class IndexController {
    @Autowired
    private BlockService blockService;
    @Autowired
    private TransactionService  transactionService;
    @RequestMapping(value = "/")
    public String index(ModelMap map) throws Exception
    {
        map.addAttribute("block_num",blockService.getMaxBlockId());
        map.addAttribute("Eos_price",CommonService.getEosPrice());
        map.addAttribute("Count_trx",transactionService.transactionCount());
        return "index2";
    }
    @RequestMapping(value = "/aa")
    public String test()
    {

        return "index_old";
    }
}
