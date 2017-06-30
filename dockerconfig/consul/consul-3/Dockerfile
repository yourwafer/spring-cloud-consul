FROM consul
ENV CONSUL_BIND_INTERFACE=eth0 CONSUL_CLIENT_INTERFACE=eth0
CMD ["agent", "-server", "-node=CONSUL-NODE-3", "-node-id=592d7fad-89ef-4362-8bf5-ae17e1a39c92", "-join=CONSUL-NODE-1"]