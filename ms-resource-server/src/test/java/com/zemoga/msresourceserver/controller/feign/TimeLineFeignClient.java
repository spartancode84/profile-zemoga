package com.zemoga.msresourceserver.controller.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.w3c.dom.Node;

/**
 * @project profile-zemoga
 * @autor Oscar Alfredo Chafloque Tampeck
 * @date 5/09/2023
 **/
@FeignClient(value = "escuelajs", url = "${app.clients.escuelajs.url}")
public interface TimeLineFeignClient {
    @GetMapping(name = "/api/v1/products", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    Node getTimeLines();
}
